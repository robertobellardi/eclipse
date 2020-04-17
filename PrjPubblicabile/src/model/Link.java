package model;

public class Link implements Pubblicabile{

	private String nomeLink;
	
	public Link(String nomeLink) {
		this.nomeLink=nomeLink;
	}
	
	public String getNomeLink() {
		return nomeLink;
	}
	
	@Override
	public void pubblica() {
		System.out.println("link : "+this.nomeLink);
	}

	@Override
	public String getName() {
		return nomeLink;
	}

	@Override
	public String getClassName() {
		return "Link";
	}
}
