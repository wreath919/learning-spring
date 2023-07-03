package com.example.demo.data.entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="RESERVATION")
@Data
public class Reservation {
  @Id
  @Column(name="RESERVATION_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long reservationId;

  @Column(name="ROOM_ID")
  private long roomId;

  @Column(name="GUEST_ID")
  private long guestId;

  @Column(name="RES_DATE")
  private Date reservationDate;
}
