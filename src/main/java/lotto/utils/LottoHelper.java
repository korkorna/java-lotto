package lotto.utils;

import lotto.domain.LottoBall;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoHelper {
    public static List<LottoBall> convertToBalls(String numbers) {
        return Arrays.stream(numbers.split(","))
                .map(number -> convertToBall(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    public static LottoBall convertToBall(int number) {
        return new LottoBall(number);
    }
}
