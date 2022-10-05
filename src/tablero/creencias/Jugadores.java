package tablero.creencias;

public class Jugadores
{
    
    protected String nombre;
	protected String cargo;

	public Jugadores() {}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
