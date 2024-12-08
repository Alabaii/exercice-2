package src;
import java.util.ArrayList;
import java.util.List;

public interface CreateAnimalService {
    // Дефолтный метод, использующий цикл while для создания 10 животных
    default List<Animal> createDefaultAnimals() {
        return createAnimalsWhile(10);
    }

    // Метод для создания произвольного количества животных (с использованием цикла for)
    List<Animal> createAnimals(int n);

    // Метод для создания произвольного количества животных (с использованием цикла do-while)
    List<Animal> createAnimalsDoWhile(int n);

    // Вспомогательный метод для создания животных с использованием while
    default List<Animal> createAnimalsWhile(int n) {
        List<Animal> animals = new ArrayList<>();
        int count = 0;
        while (count < n) {
            animals.add(generateAnimal(count));
            System.out.println("Создано животное: " + animals.get(count).getName());
            count++;
        }
        return animals;
    }

    // Метод для генерации животных
    Animal generateAnimal(int id);
}
