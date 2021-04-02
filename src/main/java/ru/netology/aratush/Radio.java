package ru.netology.aratush;

/**
 * Это класс радио.
 * @author aratush
 */
public class Radio {

  private byte station;
  private byte volume;

  /**
  * Переключение на следующую станцию.
  */
  public void nextStation() {
    if (station == 9) {
      station = 0;
    } else {
      station++;
    }
  }

  /**
  * Переключение на предыдущую станцию.
  */
  public void prevStation() {
    if (station == 0) {
      station = 9;
    } else {
      station--;
    }
  }

  /**
  * Уменьшение громкости.
  */
  public void increaseVolume() {
    if (volume < 10) {
      volume++;
    }
  }

  /**
  * Увеличение громкости.
  */
  public void decreaseVolume() {
    if (volume > 0) {
      volume--;
    }
  }

  /**
  * Получение номера станции.
  * @return номер станции
  */
  public byte getStation() {
    return station;
  }

  /**
  * Установка станции.
  * @param station - номер станции.
  */
  public void setStation(byte station) {
    if (station >= 0 && station <= 9) {
      this.station = station;
    }
  }

  /**
  * Получение уровня громкости.
  * @return уровень громкости.
  */
  public byte getVolume() {
    return volume;
  }
}
