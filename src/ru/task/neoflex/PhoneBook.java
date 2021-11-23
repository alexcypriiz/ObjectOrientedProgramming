package ru.task.neoflex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alexey Podlubnyy on 21.11.2021
 */
public class PhoneBook {
    Map<String, String> contacts = new HashMap<>();

    public void addContact(String number, String name) {
        if (!contacts.containsKey(number)) {
            contacts.put(number, name);
        }
    }

    public Map<String, String> findNumbers(String name) {
        Map<String, String> numbers = new HashMap<>();
        Pattern pattern = Pattern.compile(name.toLowerCase());
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            Matcher matcher = pattern.matcher(entry.getValue().toLowerCase());
            if (matcher.find()) {
                numbers.put(entry.getKey(), entry.getValue());
            }
        }
        if (numbers.isEmpty()) {
            return null;
        } else {
            return sortByValue(numbers);
        }
    }

//         sortByValue - сортировка мапы по значению, универсальное решение
        public <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
            List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());

            Map<K, V> result = new LinkedHashMap<>();
            for (Map.Entry<K, V> entry : list) {
                result.put(entry.getKey(), entry.getValue());
            }
            return result;
        }
}
