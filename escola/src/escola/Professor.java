package escola;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor implements identificavel{
	
	@Id
	private Long id;
	private String nome;
	
	@OneToMany(mappedBy="professor")
	private Set<Turma> turmas;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Set<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(Set<Turma> turmas) {
		this.turmas = turmas;
	}
	
	

}
