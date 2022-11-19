import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Banco {

	private String nome;
	private List<Conta> contas;

}
