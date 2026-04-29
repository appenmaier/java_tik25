package model;

import lombok.ToString;

/**
 * Electrical plug type with description, technical norm, and region of use.
 *
 * <p>Each constant carries three pieces of metadata:
 * <ul>
 *   <li><b>description</b> — human-readable name (e.g. {@code "Type-F"})</li>
 *   <li><b>norm</b> — the applicable standard (e.g. {@code "CEE7/4"})</li>
 *   <li><b>region</b> — the primary region where this plug type is used</li>
 * </ul>
 *
 * <p>Used by {@link TableLight} to indicate the plug type of a lamp.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@ToString
public enum PlugType {

   /** European Schuko plug (CEE 7/4), used throughout continental Europe. */
   TYPE_F("Type-F", "CEE7/4", "Europe"),

   /** Australian/New Zealand plug (AS/NZS 3112), also used in China and Argentina. */
   TYPE_I("Type-I", "AS/NZS 3112", "Australia");

   /** Human-readable name of this plug type. */
   private final String description;

   /** Technical norm or standard that defines this plug type. */
   private final String norm;

   /** Primary region where this plug type is in common use. */
   private final String region;

   /**
    * Creates a {@code PlugType} constant with the given metadata.
    *
    * @param description human-readable name
    * @param norm        applicable technical standard
    * @param region      primary region of use
    */
   PlugType(String description, String norm, String region) {
      this.description = description;
      this.norm = norm;
      this.region = region;
   }

   /**
    * Returns the human-readable name of this plug type (e.g. {@code "Type-F"}).
    *
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * Returns the technical norm of this plug type (e.g. {@code "CEE7/4"}).
    *
    * @return the norm
    */
   public String getNorm() {
      return norm;
   }

   /**
    * Returns the primary region where this plug type is used (e.g. {@code "Europe"}).
    *
    * @return the region
    */
   public String getRegion() {
      return region;
   }

}
