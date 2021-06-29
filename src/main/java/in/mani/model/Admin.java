package in.mani.model;

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
@Table(value="employees")
public class Admin {
	
	@Id
	private Integer id;
	
	@Column("admin_name")
	private String adminId;
	
	@Column("admin_password")
	private String password;
}
