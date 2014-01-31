package com.airlinemgmt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.airlinemgmt.DB.DBManager;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.validations.Validations;
import com.sun.org.apache.regexp.internal.recompile;

public class JourneyDAO {

	public String validateFields(Journey journey) {

		String errorMessage = "true";
		try {

			Validations validations = new Validations();

			System.out.println(journey.getAirline());
			if (!validations.verifyString(journey.getAirline())) {
				return errorMessage = "Incorrect Airline Name";
			}
			if (!validations.verifyString(journey.getBoardingPoint())) {
				return errorMessage = "Incorrect Source";
			}

			if (!validations.verifyString(journey.getDestinationPoint())) {
				return errorMessage = "Incorrect Destination";
			}
			if (!validations.verifyFlightNumber(journey.getFlightNum())) {
				return errorMessage = "Incorrect Flight Number";
			}
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

			java.util.Date fDDate = sdf.parse(journey.getDepartureDate());

			java.util.Date fLDate = sdf.parse(journey.getArrivalDate());

			java.util.Date today = new java.util.Date();

			if (fDDate.before(today)) {

				return errorMessage = "Please Select A Valid Flight Departure Date";

			}

			if (fLDate.before(today)) {

				errorMessage = "Please Select A Valid Flight Landing Date";

			}

			if (fLDate.before(fDDate)) {

				errorMessage = "Please Select Flight Landing Date After Departure Date";

			}

			if (fDDate.after(fLDate)) {

				errorMessage = "Please Select Flight Departure Date Before Landing Date";

			}

			if (!validations.isValidFare(journey.getFare() + ""))
				return errorMessage = "Incorrect Fare";

			if (!validations.isValidNoOfSeats(journey.getNumberOfSeats() + ""))
				return errorMessage = "Incorrect number of seats";

			String error = validateFlight(journey);
			if (error != null) {
				return error;
			}
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

		return errorMessage;

	}

	public String validateFlight(Journey journey) {

		String error = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM JOURNEY WHERE FLIGHTNUM='"
					+ journey.getFlightNum() + "' AND BOARDINGPOINT='"
					+ journey.getBoardingPoint() + "' AND DESTINATIONPOINT='"
					+ journey.getDestinationPoint() + "' AND ISACTIVE=1";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				error = "Duplicate Value Provided. Flight already created Src ->"
						+ rs.getString("BOARDINGPOINT")
						+ " AND Dest -> "
						+ rs.getString("DEST");
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return error;
	}

	public boolean updateParentJourney(Journey journey) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "UPDATE JOURNEY SET DESTINATIONPOINT=? ,BOARDINGPOINT =?,DEPARTUREDATE =?,ARRIVALDATE=?,FARE=? WHERE JOURNEYID=?";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, journey.getDestinationPoint());
			ps.setString(2, journey.getBoardingPoint());
			ps.setString(3, journey.getDepartureDate());
			ps.setString(4, journey.getArrivalDate());
			ps.setString(5, journey.getFare() + "");
			ps.setString(6, journey.getJourneyId() + "");
			// ps.setString(6, journey.getIsActive()+"");
			result = ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public boolean insertJourneyDetails(Journey journey) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "INSERT INTO JOURNEY(FLIGHTNUM,DESTINATIONPOINT,BOARDINGPOINT,DEPARTUREDATE,ARRIVALDATE,FARE,ISACTIVE) VALUES (?,?,?,?,?,?,?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, journey.getFlightNum());
			ps.setString(2, journey.getDestinationPoint());
			ps.setString(3, journey.getBoardingPoint());
			ps.setString(4, journey.getDepartureDate());
			ps.setString(5, journey.getArrivalDate());
			ps.setString(6, journey.getFare() + "");
			ps.setInt(7, 1);
			// ps.setString(6, journey.getIsActive()+"");
			result = ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public boolean processJourneyInfo(Journey[] journeyInfo) {
		boolean result = false;
		for (int i = 0; i < journeyInfo.length; i++) {
			result = insertJourneyDetails(journeyInfo[i]);
			if (result) {
				break;
			}
		}
		return result;
	}

	public Journey[] searchJourney(Journey searchObj) {
		Journey[] result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM JOURNEY j,FLIGHTDETAILS f WHERE BOARDINGPOINT = '"
					+ searchObj.getBoardingPoint()
					+ "' AND DESTINATIONPOINT = '"
					+ searchObj.getDestinationPoint()
					+ "' AND  j.flightNum=f.flightNum AND IsActive=1 ";
			con = DBManager.getConnection();

			String addnl = "";
			if (searchObj.getAirline() != null
					&& !searchObj.getAirline().equalsIgnoreCase("")) {
				addnl += "AND f.AIRLINENAME like '%" + searchObj.getAirline()
						+ "%'";
			}
			if (searchObj.getNumberOfSeats() != 0) {
				addnl += "AND f.AVAILALESEATS >= "
						+ searchObj.getNumberOfSeats() + " ";
			}
			if (searchObj.getFlightNum() != null
					&& !searchObj.getFlightNum().equalsIgnoreCase("")) {
				addnl += "AND j.FLIGHTNUM like '%" + searchObj.getFlightNum()
						+ "%'";
			}
			// if(searchObj.getDepartureDate()!=null
			// ||(!searchObj.getDepartureDate().equalsIgnoreCase("")))
			// {
			// addnl+="AND j.DEPARTUREDATE() ="+searchObj.getDepartureDate()+" ";
			// }

			if (searchObj.getMinFare() != null
					&& searchObj.getMaxFare() != null
					&& !searchObj.getMinFare().equalsIgnoreCase("")
					&& !searchObj.getMaxFare().equalsIgnoreCase("")) {
				addnl += "AND j.Fare IN (" + searchObj.getMinFare() + ","
						+ searchObj.getMaxFare() + ")";
			} else if (searchObj.getMinFare() != null
					&& !searchObj.getMinFare().equalsIgnoreCase("")) {
				addnl += "AND j.Fare >= " + searchObj.getMinFare() + " ";
			} else if (searchObj.getMaxFare() != null
					&& !searchObj.getMaxFare().equalsIgnoreCase("")) {
				addnl += "AND j.Fare <=  " + searchObj.getMaxFare() + " ";
			}

			sql += addnl;
			System.out.println(sql);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			List<Journey> journeyDetails = new ArrayList<Journey>();
			Journey journeyInfo = null;
			while (rs.next()) {
				journeyInfo = new Journey();
				journeyInfo.setJourneyId(rs.getInt("JOURNEYID"));
				journeyInfo.setAirline(rs.getString("AIRLINENAME"));
				journeyInfo.setBoardingPoint(rs.getString("BOARDINGPOINT"));
				journeyInfo.setDestinationPoint(rs
						.getString("DESTINATIONPOINT"));
				journeyInfo.setNumberOfSeats(rs.getInt("AVAILABLESEATS"));
				journeyInfo.setDepartureDate(rs.getString("DEPARTUREDATE"));
				journeyInfo.setFare(rs.getFloat("FARE"));
				journeyInfo.setFlightNum(rs.getString("FLIGHTNUM"));
				journeyInfo.setArrivalDate(rs.getString("ARRIVALDATE"));
				journeyDetails.add(journeyInfo);
			}

			result = new Journey[journeyDetails.size()];
			int index = 0;
			for (Journey journey : journeyDetails) {
				result[index] = journey;
				index++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public Journey[] getJourneyInfo(String flightNum) {

		System.out.println("In journe");

		Journey[] result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM JOURNEY  WHERE FLIGHTNUM= '"
					+ flightNum + "'AND ISACTIVE=1";
			con = DBManager.getConnection();

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			List<Journey> journeyDetails = new ArrayList<Journey>();
			Journey journeyInfo = null;
			while (rs.next()) {
				journeyInfo = new Journey();
				journeyInfo.setJourneyId(rs.getInt("JOURNEYID"));
				journeyInfo.setBoardingPoint(rs.getString("BOARDINGPOINT"));
				journeyInfo.setDestinationPoint(rs
						.getString("DESTINATIONPOINT"));
				journeyInfo.setDepartureDate(rs.getString("DEPARTUREDATE"));
				journeyInfo.setFlightNum(rs.getString("FLIGHTNUM"));
				journeyInfo.setArrivalDate(rs.getString("ARRIVALDATE"));
				journeyInfo.setFare(rs.getFloat("FARE"));
				journeyDetails.add(journeyInfo);

			}

			result = new Journey[journeyDetails.size()];
			int index = 0;
			for (Journey journey : journeyDetails) {
				result[index] = journey;
				index++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

	public boolean deleteJourneyInfo(String journeyId) {

		System.out.println("Reached here");
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "UPDATE JOURNEY SET ISACTIVE=0 WHERE JOURNEYID=(?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, journeyId);
			result = ps.execute();
			System.out.println(ps.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;

	}

}
