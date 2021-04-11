package ru.netology.aratush;

/**
 * Это класс радио.
 * @author aratush
 */
public class Radio {

  private byte station;
  private byte volume;
  private final byte stationCount;

  public Radio() {
    stationCount = 10;
  }

  public Radio(byte stationCount) {
    this.stationCount = stationCount;
  }

  /**
   * Получение кол-ва станций.
   */
  public byte getStationCount() {
    return stationCount;
  }

  /**
  * Переключение на следующую станцию.
  */
  public void nextStation() {
    if (station == stationCount) {
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
      station = stationCount;
    } else {
      station--;
    }
  }

  /**
  * Уменьшение громкости.
  */
  public void increaseVolume() {
    if (volume < 100) {
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
    if (station >= 0 && station <= stationCount) {
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
