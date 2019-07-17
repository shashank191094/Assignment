package consultadd.assignment9;

public class MsSQLConnection extends Connector {


	@Override
	public void openConnection() {
		System.out.println("MsSQLConnection: Inside openConnection");
	}

	@Override
	public void closeConnection() {
		System.out.println("MsSQLConnection: Inside openConnection");
	}

	@Override
	public void fireQuery() {
		System.out.println("MsSQLConnection: Inside openConnection");
	}

}
