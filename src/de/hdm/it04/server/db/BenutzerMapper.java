package de.hdm.it04.server.db;

import java.sql.*;

/**
 * Mapper-Klasse, die <code>Benutzer</code>-Objekte auf eine relationale
 * Datenbank abbildet. Hierzu wird eine Reihe von Methoden zur Verf�gung
 * gestellt, mit deren Hilfe z.B. Objekte gesucht, erzeugt, modifiziert und
 * gel�scht werden k�nnen. Das Mapping ist bidirektional. D.h., Objekte k�nnen
 * in DB-Strukturen und DB-Strukturen in Objekte umgewandelt werden.
 * 
 * {@link BaugruppeMapper, St�cklisteMapper, EnderzeugnisMapper, BauteilMapper}
 *
 * @author Schneider, M�hler, Thies
 */
public class BenutzerMapper {

  /**
   * Die Klasse BenutzerMapper wird nur einmal instantiiert. Man spricht hierbei
   * von einem sogenannten <b>Singleton</b>.
   * <p>
   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal f�r
   * s�mtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
   * einzige Instanz dieser Klasse.
   * 
   * @see benutzerMapper()
   */
  private static BenutzerMapper benutzerMapper = null;

  /**
   * Gesch�tzter Konstruktor - verhindert die M�glichkeit, mit <code>new</code>
   * neue Instanzen dieser Klasse zu erzeugen.
   */
  protected BenutzerMapper() {
  }

  /**
   * Diese statische Methode kann aufgrufen werden durch
   * <code>BenutzerMapper.benutzerMapper()</code>. Sie stellt die
   * Singleton-Eigenschaft sicher, indem Sie daf�r sorgt, dass nur eine einzige
   * Instanz von <code>BenutzerMapper</code> existiert.
   * <p>
   * 
   * <b>Fazit:</b> BenutzerMapper sollte nicht mittels <code>new</code>
   * instantiiert werden, sondern stets durch Aufruf dieser statischen Methode.
   * 
   * @return Das <code>BenutzerMapper</code>-Objekt.
   * @see BenutzerMapper
   */
  public static BenutzerMapper benutzerMapper() {
    if (benutzerMapper == null) {
      benutzerMapper = new BenutzerMapper();
    }

    return benutzerMapper;
  }
}