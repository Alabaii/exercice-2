package src;

import java.util.List;

public interface SearchService {
    List<String> findLeapYearNames(List<Animal> animals); // Животные из високосного года
    List<Animal> findOlderAnimal(List<Animal> animals, int n); // Старше N лет
    void findDuplicate(List<Animal> animals); // Найти дубликаты
}
