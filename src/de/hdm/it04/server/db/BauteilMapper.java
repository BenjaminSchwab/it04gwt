package de.hdm.it04.server.db;

import java.sql.*;

/**
 * Mapper-Klasse, die <code>Bauteil</code>-Objekte auf eine relationale
 * Datenbank abbildet. Hierzu wird eine Reihe von Methoden zur Verf�gung
 * gestellt, mit deren Hilfe z.B. Objekte gesucht, erzeugt, modifiziert und
 * gel�scht werden k�nnen. Das Mapping ist bidirektional. D.h., Objekte k�nnen
 * in DB-Strukturen und DB-Strukturen in Objekte umgewandelt werden.
 * 
 * {@link BaugruppeMapper, St�cklisteMapper, EnderzeugnisMapper, BenutzerMapper}
 *
 * @author Schneider, M�hler, Thies
 */
public class BauteilMapper {

  /**
   * Die Klasse BauteilMapper wird nur einmal instantiiert. Man spricht hierbei
   * von einem sogenannten <b>Singleton</b>.
   * <p>
   * Diese Variable ist durch den Bezeichner <code>static</code> nur einmal f�r
   * s�mtliche eventuellen Instanzen dieser Klasse vorhanden. Sie speichert die
   * einzige Instanz dieser Klasse.
   * 
   * @see bauteilMapper()
   */
  private static BauteilMapper bauteilMapper = null;

  /**
   * Gesch�tzter Konstruktor - verhindert die M�glichkeit, mit <code>new</code>
   * neue Instanzen dieser Klasse zu erzeugen.
   */
  protected BauteilMapper() {
  }

  /**
   * Diese statische Methode kann aufgrufen werden durch
   * <code>BauteilMapper.bauteilMapper()</code>. Sie stellt die
   * Singleton-Eigenschaft sicher, indem Sie daf�r sorgt, dass nur eine einzige
   * Instanz von <code>BauteilMapper</code> existiert.
   * <p>
   * 
   * <b>Fazit:</b> BauteilMapper sollte nicht mittels <code>new</code>
   * instantiiert werden, sondern stets durch Aufruf dieser statischen Methode.
   * 
   * @return Das <code>BauteilMapper</code>-Objekt.
   * @see BauteilMapper
   */
  public static BauteilMapper bauteilMapper() {
    if (bauteilMapper == null) {
      bauteilMapper = new BauteilMapper();
    }

    return bauteilMapper;
  }
}
