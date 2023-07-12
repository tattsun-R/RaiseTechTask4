import java.util.List;

public class Main {
    public static void main(String[] args) {
                List<String> musicList = List.of("bad communication","blowin'","love phantom","ultra soul","unite");
        musicList.stream()
                .filter(title ->title.contains("n"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}