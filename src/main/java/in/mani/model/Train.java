package in.mani.model;

import java.sql.Time;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(value = "trains")
public class Train {

	@Id
	private Integer id;

	@Column("trainnumber")
	private Integer trainNumber;

	@Column("trainname")
	private String trainName;

	@Column("train_source")
	private String source;

	@Column("train_destination")
	private String destination;

	@Column("source_time")
	private Time sourceTime;

	@Column("destination_time")
	private Time destinationTime;

	@Column("class_type")
	private String classType;

	private Integer fare;

	private Integer availability;
}
