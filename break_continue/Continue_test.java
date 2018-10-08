class Person {
    int height;
    int weight;
};

public class Continue_test {
    public static void main(String[] args) {
        Person people[] = new Person[4];

       for(int i=0; i<4; i++) {
           people[i] = new Person();
       }

        people[0].height = 180;
        people[0].weight = 75;

        people[1].height = 170;
        people[1].weight = 75;

        people[2].height = 181;
        people[2].weight = 60;

        people[3].height = 181;
        people[3].weight = 76;

		for(int i = 0; i < 4; i++) { 
            if (people[i].height < 180) {
                continue;
            }

            // if (!(people[i].weight >= 75 && people[i].weight <= 80)) {
            if (people[i].weight < 75 || people[i].weight > 80) {
                continue;
            }

            System.out.printf("第i = %d個人%n", i + 1);
		}
    }
}
