package programmers.bruteforce;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int height = 0;
        int width = 0;

        if (yellow == 1) {
            answer = new int[]{3, 3};
        } else {
            for (int i = 2; i <= yellow; i++) {
                if ((yellow % i) == 0) {

                    // (2, 12), (3, 8), (4, 6) ...
                    width = i; // 가로
                    height = (yellow / width); // 세로

                    int brownCheck = ((width + 2) * 2) + (height * 2);

                    if (brownCheck == brown) {
                        System.out.println("height : " + height + "width : " + width);
                        if (width >= height) {
                            answer = new int[]{(width + 2), (height + 2)};
                        } else {
                            answer = new int[]{(height + 2), (width + 2)};
                        }

                        break;
                    }

                }
            }
        }

        return answer;
    }
}
