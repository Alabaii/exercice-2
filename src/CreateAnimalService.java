package src;
import java.util.List;

public interface CreateAnimalService {
    List<Animal> createDefaultAnimals(); // Создать 10 животных (while)
    List<Animal> createAnimals(int n);   // Создать N животных (for)
    List<Animal> createAnimalsDoWhile(int n); // Создать N животных (do-while)
}
