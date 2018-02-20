public interface IProvedor {
	public void AgregarC(Cliente c);
	public void Removerc(Cliente c);
	public void notifyUsers();
	public void AgregarPaquete(String id,Cliente c,String art);

}
