public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore list = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(list);
		System.out.println("Most Freqeunt Toy: " + list.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + list.getMostFrequentType());
	}
}