package pl.patryk.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "champions")
public class Champions {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer championid;
  String championname;
  String role;
  Float winrate;
  Float pickrate;



}
