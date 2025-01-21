package zad1;

import java.util.Optional;
import java.util.Scanner;

public class OptionalNameDemo {

    static Optional<String> requestUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите ваше имя (или оставьте пустым, если хотите скрыть): ");
        String username = scanner.nextLine();

        if (username.isBlank()) {
            return Optional.empty();
        } else {
            return Optional.of(username);
        }
    }

    public static void main(String[] args) {
        Optional<String> maybeName = requestUserName();
        if (maybeName.isPresent()) {
            String name = maybeName.get();
            System.out.println("Привет, " + name + "!");
        } else {
            System.out.println("Ваше право не называть имя!");
        }
    }
}