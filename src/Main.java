package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createService = new CreateAnimalServiceImpl();
        SearchService searchService = new SearchServiceImpl();

        // Генерация животных
        List<Animal> animals = createService.createDefaultAnimals();

        // Вывод на экран всех созданных животных
        System.out.println("Список созданных животных:");
        animals.forEach(a -> System.out.println(a.getName() + " (" + a.getBreed() + ")"));

        // Поиск животных из високосного года
        System.out.println("\nЖивотные из високосного года:");
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        leapYearNames.forEach(System.out::println);

        // Поиск животных старше 3 лет
        System.out.println("\nЖивотные старше 3 лет:");
        List<Animal> olderAnimals = searchService.findOlderAnimal(animals, 3);
        olderAnimals.forEach(a -> System.out.println(a.getName() + " (" + a.getBirthDate() + ")"));

        // Поиск дубликатов
        System.out.println("\nПоиск дубликатов:");
        searchService.findDuplicate(animals);
    }
}

