
public class TestGhiozdan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ghiozdan ghiozdan = new Ghiozdan();
		
		ghiozdan.add(new Manual("a"));
		ghiozdan.add(new Caiet("x"));
		
		ghiozdan.add(new Manual("b"));
		ghiozdan.add(new Caiet("y"));
		
		ghiozdan.add(new Manual("c"));		
		ghiozdan.add(new Caiet("z"));
		
		System.out.println("Numar total de rechizite: " + ghiozdan.getNrRechizite());
		System.out.println("Numar total de caiete: " + ghiozdan.getNrCaiete());
		System.out.println("Numar total de manuale: " + ghiozdan.getNrManuale());
		System.out.println();
		
		System.out.println("Toate rechizitele in ordine: ");
		ghiozdan.listItems();
		System.out.println();
		
		System.out.println("Toate obiectele de tip Caiet in ordine: ");
		ghiozdan.listCaiet();
		System.out.println();
		
		System.out.println("Toate obiectele de tip Manual in ordine: ");
		ghiozdan.listManual();
	}

}
