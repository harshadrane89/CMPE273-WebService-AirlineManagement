package com.airlinemgmt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.airlinemgmt.DB.DBManager;
import com.airlinemgmt.beans.Journey;
import com.airlinemgmt.beans.Reservation;
import com.airlinemgmt.beans.Traveller;

public class ReservationDAO {

	public boolean createReservation(Reservation reservationInfo) {
		boolean result = true;
		updateTransaction(reservationInfo);
		updatePassengerInfo(reservationInfo);
		updateReservation(reservationInfo.getJourneyId() + "",
				reservationInfo.getCustomerId(), getPaymentId());
		return result;

	}

	public boolean updateReservation(String journeyID, String customerID,
			String paymentID) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "INSERT INTO RESERVATION(JOURNEYID,CUSTOMERID,PAYMENTID,ISACTIVE) VALUES (?,?,?,1)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, journeyID);
			ps.setString(2, customerID);
			ps.setString(3, paymentID);
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

	public boolean updateTransaction(Reservation reservation) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "INSERT INTO TRANSACTION(CUSTOMERID,CARDNUMBER,CARDCODE,EXPIRYDATE,AMOUNT) VALUES (?,?,?,?,?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, reservation.getCustomerId());
			ps.setString(2, reservation.getCreditCardNumber());
			ps.setString(3, reservation.getCardCode());
			ps.setString(4, reservation.getReservationDate());
			ps.setString(5, reservation.getFare() + "");
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

	public String getReservationId() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String result = "";

		try {
			String sql = "SELECT MAX(RESID) FROM RESERVATION";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				result = (rs.getInt(1) + 1) + "";
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

	public String getPaymentId() {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String result = "";

		try {
			String sql = "SELECT MAX(PAYMENTID) FROM TRANSACTION";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				result = rs.getString(1);
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

	public boolean updatePassengerInfo(Reservation reservation) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "INSERT INTO PASSENGER_INFO(JOURNEYID,CUSTOMERID,PAYMENTID,FNAME,LNAME,ICARD_TYPE,ICARD,RESID) VALUES (?,?,?,?,?,?,?,?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, reservation.getJourneyId() + "");
			ps.setString(2, reservation.getCustomerId());
			ps.setString(3, getPaymentId());
			ps.setString(8, getReservationId());

			for (Traveller traveller : reservation.getPassenger()) {
				ps.setString(4, traveller.getfName());
				ps.setString(5, traveller.getlName());
				ps.setString(6, traveller.getNationality());
				ps.setString(7, traveller.getPassNum());
				ps.execute();
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

	public boolean deleteReservation(String reservationID) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;

		try {
			String sql = "UPDATE RESERVATION SET ISACTIVE=0 WHERE RESID=(?)";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, reservationID);
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

	public Reservation[] getAllReservation() {

		Reservation[] result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM RESERVATION r,TRANSACTION t,PERSON p,CUSTOMER c,JOURNEY j,flightdetails f WHERE f.flightNum=j.flightNum AND p.PERSONID=c.PERSONID AND r.PAYMENTID=t.PAYMENTID AND r.CUSTOMERID=c.custId AND r.JOURNEYID=j.JOURNEYID and r.IsActive='1' order by TDate DESC";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			List<Reservation> reservations = new ArrayList<Reservation>();
			Reservation reservation = null;
			while (rs.next()) {
				reservation = new Reservation();

				Traveller p = new Traveller();
				p.setCustId(rs.getString("CustomerId"));
				p.setfName(rs.getString("FName"));
				p.setlName(rs.getString("LName"));
				p.setNationality(rs.getString("nationality"));
				p.setPassNum(rs.getString("passnum"));
				p.setContactNo(rs.getString("contactNo"));

				Journey journeyInfo = new Journey();
				journeyInfo.setAirline(rs.getString("AIRLINENAME"));
				journeyInfo.setJourneyId(rs.getInt("JOURNEYID"));
				journeyInfo.setBoardingPoint(rs.getString("BOARDINGPOINT"));
				journeyInfo.setDestinationPoint(rs
						.getString("DESTINATIONPOINT"));
				journeyInfo.setDepartureDate(rs.getString("DEPARTUREDATE"));
				journeyInfo.setFlightNum(rs.getString("FLIGHTNUM"));
				journeyInfo.setArrivalDate(rs.getString("ARRIVALDATE"));
				journeyInfo.setFare(rs.getFloat("FARE"));

				reservation.setTraveller(p);
				reservation.setFare(rs.getFloat("Amount"));
				reservation.setReservationId(rs.getInt("RESID"));
				reservation.setCreditCardNumber(rs.getString("CARDNUMBER"));
//				reservation.setReservationDate((rs.getString("TDATE"));
				reservation.setPassenger(getPassenger(reservation.getReservationId()+""));
				reservation.setJourneyInfo(journeyInfo);
				reservations.add(reservation);
			}

			result = new Reservation[reservations.size()];
			int index = 0;
			for (Reservation reserve : reservations) {
				result[index] = reserve;
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

	public Traveller[] getPassenger(String resId) {

		Traveller[] result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM PASSENGER_INFO WHERE RESID=" + resId + "";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			List<Traveller> travellerInfo = new ArrayList<Traveller>();
			Traveller traveller = null;
			while (rs.next()) {
				traveller = new Traveller();
				traveller.setfName(rs.getString("FNAME"));
				traveller.setlName(rs.getString("LNAME"));
				traveller.setNationality(rs.getString("ICARD_TYPE"));
				traveller.setPassNum(rs.getString("ICARD"));
				travellerInfo.add(traveller);
			}

			result = new Traveller[travellerInfo.size()];
			int index = 0;
			for (Traveller travel : travellerInfo) {
				result[index] = travel;
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

	public Traveller[] getPassengerInfo(String fligtNum)
	{


		Traveller[] result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM PASSENGER_INFO WHERE JOURNEYID IN (SELECT JOURNEYID FROM JOURNEY WHERE FLIGHTNUM='"+fligtNum+"')";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			List<Traveller> travellerInfo = new ArrayList<Traveller>();
			Traveller traveller = null;
			while (rs.next()) {
				traveller = new Traveller();
				traveller.setfName(rs.getString("FNAME"));
				traveller.setlName(rs.getString("LNAME"));
				traveller.setNationality(rs.getString("ICARD_TYPE"));
				traveller.setPassNum(rs.getString("ICARD"));
				travellerInfo.add(traveller);
			}

			result = new Traveller[travellerInfo.size()];
			int index = 0;
			for (Traveller travel : travellerInfo) {
				result[index] = travel;
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
	public Reservation[] getPassengerReservation(String customerID) {

		Reservation[] result = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM RESERVATION r,TRANSACTION t,PERSON p,CUSTOMER c,JOURNEY j WHERE p.PERSONID=c.PERSONID AND r.PAYMENTID=t.PAYMENTID AND r.CUSTOMERID=c.PERSONID AND r.JOURNEYID=j.JOURNEYID AND r.CUSTOMERID='"+customerID+"' ";
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			List<Reservation> reservations = new ArrayList<Reservation>();
			Reservation reservation = null;
			while (rs.next()) {
				reservation = new Reservation();

				Traveller p = new Traveller();
				p.setCustId(rs.getString("CustomerId"));
				p.setfName(rs.getString("FName"));
				p.setlName(rs.getString("LName"));
				p.setNationality(rs.getString("nationality"));
				p.setNationality(rs.getString("passnum"));

				Journey journeyInfo = new Journey();
				journeyInfo.setJourneyId(rs.getInt("JOURNEYID"));
				journeyInfo.setBoardingPoint(rs.getString("BOARDINGPOINT"));
				journeyInfo.setDestinationPoint(rs
						.getString("DESTINATIONPOINT"));
				journeyInfo.setDepartureDate(rs.getString("DEPARTUREDATE"));
				journeyInfo.setFlightNum(rs.getString("FLIGHTNUM"));
				journeyInfo.setArrivalDate(rs.getString("ARRIVALDATE"));
				journeyInfo.setFare(rs.getFloat("FARE"));

				reservation.setTraveller(p);
				reservation.setReservationId(rs.getInt("RESID"));
				reservation.setCreditCardNumber(rs.getString("CARDNUMBER"));
				reservation.setExpDate(rs.getString("TDATE"));
				reservation.setPassenger(getPassenger(reservation.getReservationId()+""));
				reservation.setJourneyInfo(journeyInfo);
				reservations.add(reservation);
			}

			result = new Reservation[reservations.size()];
			int index = 0;
			for (Reservation reserve : reservations) {
				result[index] = reserve;
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
}