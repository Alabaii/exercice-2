package src;
import java.time.LocalDate;

/**
 * Интерфейс Animal описывает поведение всех животных.
 */
public interface Animal {
    String getBreed();     // Получить породу
    String getName();      // Получить имя
    Double getCost();      // Получить стоимость
    String getCharacter(); // Получить характер
    LocalDate getBirthDate(); // Получить дату рождения
}

