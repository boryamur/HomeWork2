import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

        String pathFile = "task2.txt";

        public void writeFile(int element, int element2, int count) throws IOException {
            File fileLog = new File(pathFile);
            FileWriter fileWriter = new FileWriter(fileLog, true);
            fileWriter.write("Выполнено ");
            fileWriter.write(count + " ");
            fileWriter.write("действие:  ");
            fileWriter.write(element + " ");
            fileWriter.write("заменили на  ");
            fileWriter.write(element2 + "\n");
            fileWriter.flush();
            fileWriter.close();
        }

    public void writeFileFirstLine() throws IOException {
        File fileLog = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(fileLog)) {
            fileWriter.write(" ");
        }

        }


        public void bubbleSort(int[] sortArray) throws IOException {
            writeFileFirstLine();
            int count = 1;
            for (int i = 0; i < sortArray.length - 1; i++) {
                for(int j = 0; j < sortArray.length - i - 1; j++) {
                    if(sortArray[j + 1] < sortArray[j]) {
                        int swap = sortArray[j];
                        sortArray[j] = sortArray[j + 1];
                        sortArray[j + 1] = swap;
                        writeFile(sortArray[j], sortArray[j + 1], count);
                        count ++;
                    }
                }
            }
        }


        }

        /*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/
