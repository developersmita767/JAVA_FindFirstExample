package Java_8;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {

	public static void main(String[] args) {
		/**
		 * Find even numbers in a given list
		 */
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		Optional<Integer> mulThree=list.stream().filter(a->a%3==0).findFirst();
		System.out.println(mulThree.get());
	}

}
