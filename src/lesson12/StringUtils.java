package lesson12;

/**
 * Утилитный класс для работы со строками
 * 
 * @author nedis
 * @version 1.0
 */
public interface StringUtils {
	
	/**
	 * Возвращает результат деления number1 на number2
	 *
	 * @param number1 делимое
	 * @param number2 делитель
	 * @throws NullPointerException  если number1 или number2 равны null
	 * @throws NumberFormatException если number1 или number2 не числа
	 * @throws ArithmeticException   если number2 равно нулю
	 */
	double div (String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException;
	
	/**
	 * Ищет все вхождения слова <b>word</b> в тексте <b>text</b> и возвращает массив индексов слов
	 *
	 * @param text исходный текст
	 * @param word искомое слово
	 * @return масив индексов каждого вхождения слова
	 * @throws NullPointerException
	 */
	Integer[] findWord (String text, String word) throws NullPointerException;
	
	/**
	 * Находит в тексте все double числа и возвращает их в виде массива. Если чисел не обнаружено в тексте необходимо выбросить исключение CustomException с сообщением:
	 * <b>"Not found"</b>
	 * 
	 * @param text исходный текст
	 * @return массив double чисел
	 * @throws CustomException если чисел в тексте не обнаружено
	 */
	Double[] findNumbers(String text) throws CustomException;
}
