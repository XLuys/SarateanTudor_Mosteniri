
public class Ghiozdan {
	private Rechizita[] rechizite;
	private int numarRechizite;
	
	public Ghiozdan() {
		// TODO Auto-generated constructor stub
		rechizite = new Rechizita[100];
		numarRechizite = 0;
	}
	
	public void add(Caiet caiet) {
		rechizite[numarRechizite ++] = caiet;
	}
	
	public void add(Manual manual) {
		rechizite[numarRechizite ++] = manual;
	}
	
	public void listItems() {
		for(int i = 0; i < numarRechizite; i ++) {
			System.out.println((i + 1) + ": " + rechizite[i].getNume());
		}
	}
	
	public void listManual() {
		for(int i = 0; i < numarRechizite; i ++) {
			if(rechizite[i] != null && rechizite[i].getClass() == Manual.class) {
				System.out.println(rechizite[i].getNume());
			}
		}
	}
	
	public void listCaiet() {
		for(int i = 0; i < numarRechizite; i ++) {
			if(rechizite[i] != null && rechizite[i].getClass() == Caiet.class) {
				System.out.println(rechizite[i].getNume());
			}
		}
	}
	
	public int getNrRechizite() {
		return numarRechizite;
	}
	
	public int getNrManuale() {
		int numarTotalDeManuale = 0;
		for(Rechizita item : rechizite) {
			if(item != null && item.getClass() == Manual.class) {
				numarTotalDeManuale ++;
			}
		}
		return numarTotalDeManuale;
	}
	
	public int getNrCaiete() {
		int numarTotalDeCaiete = 0;
		for(Rechizita item : rechizite) {
			if(item != null && item.getClass() == Caiet.class) {
				numarTotalDeCaiete ++;
			}
		}
		return numarTotalDeCaiete;
	}
}
