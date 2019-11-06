
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

	public static void main(String[] args) {

		List<Hero> heroes = new ArrayList<>();

		heroes.add(new Hero("Hulk", 49));
		heroes.add(new Hero("Black Widow", 34));
		heroes.add(new Hero("Captain America", 100));
		heroes.add(new Hero("Thor", 1501));

		Collections.sort(heroes);

		System.out.println("\nOrder by name:");
		Thanos.showList(heroes);

		Comparator<Hero> comparator = new Comparator<>() {

			@Override
			public int compare(Hero hero1, Hero hero2) {

				return hero2.getAge() - hero1.getAge();
			}
		};

		Collections.sort(heroes, comparator);

		System.out.println("\nOrder by age:");
		Thanos.showList(heroes);
	}

	private static void showList(List<Hero> heroes) {
		// TODO Auto-generated method stub
		for (Hero toto : heroes) {
			System.out.println(toto.getName() + ", " + toto.getAge());
		}
	}

}