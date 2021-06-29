package in.mani.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(value="users")
public class User {

	@Id
	private Integer id;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private Long mobilenumber;
	
	private String username;
	
	private String newpassword;
}
