package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public List<Animal> createDefaultAnimals() {
        List<Animal> animals = new ArrayList<>();
        int count = 0;

        while (count < 10) {
            animals.add(generateAnimal(count));
            System.out.println("Создано животное: " + animals.get(count).getName());
            count++;
        }

        return animals;
    }

    @Override
    public List<Animal> createAnimals(int n) {
        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            animals.add(generateAnimal(i));
            System.out.println("Создано животное: " + animals.get(i).getName());
        }

        return animals;
    }

    @Override
    public List<Animal> createAnimalsDoWhile(int n) {
        List<Animal> animals = new ArrayList<>();
        int count = 0;

        do {
            animals.add(generateAnimal(count));
            System.out.println("Создано животное: " + animals.get(count).getName());
            count++;
        } while (count < n);

        return animals;
    }

    private Animal generateAnimal(int id) {
        // Генерация животных по порядку
        switch (id % 4) {
            case 0: return new Wolf("WolfBreed" + id, "Wolf" + id, 500.0, "Brave", LocalDate.of(2020, 1, 1));
            case 1: return new Shark("SharkBreed" + id, "Shark" + id, 800.0, "Fierce", LocalDate.of(2019, 2, 2));
            case 2: return new Dog("DogBreed" + id, "Dog" + id, 300.0, "Loyal", LocalDate.of(2021, 3, 3));
            default: return new Cat("CatBreed" + id, "Cat" + id, 200.0, "Playful", LocalDate.of(2018, 4, 4));
        }
    }
}
