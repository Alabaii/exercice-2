package src;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService {

    @Override
    public List<String> findLeapYearNames(List<Animal> animals) {
        return animals.stream()
                .filter(a -> a.getBirthDate().isLeapYear())
                .map(Animal::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<Animal> findOlderAnimal(List<Animal> animals, int n) {
        LocalDate cutoffDate = LocalDate.now().minusYears(n);
        return animals.stream()
                .filter(a -> a.getBirthDate().isBefore(cutoffDate))
                .collect(Collectors.toList());
    }

    @Override
    public void findDuplicate(List<Animal> animals) {
        Set<Animal> uniqueAnimals = new HashSet<>();
        animals.stream()
                .filter(a -> !uniqueAnimals.add(a))
                .forEach(a -> System.out.println("Дубликат найден: " + a.getName()));
    }
}
