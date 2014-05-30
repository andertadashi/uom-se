/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright 2010-2014, Jean-Marie Dautelle, Werner Keil, V2COM and individual
 *  contributors by the @author tag.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.unitsofmeasurement.impl.format.internal;

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface UCUMParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int ATOM_CHAR = 1;
  /** RegularExpression Id. */
  int ESCAPED_ATOM_CHAR = 2;
  /** RegularExpression Id. */
  int TERMINAL_ATOM_CHAR = 3;
  /** RegularExpression Id. */
  int LCBRACKET = 4;
  /** RegularExpression Id. */
  int RCBRACKET = 5;
  /** RegularExpression Id. */
  int LSBRACKET = 6;
  /** RegularExpression Id. */
  int RSBRACKET = 7;
  /** RegularExpression Id. */
  int ANNOTATION = 8;
  /** RegularExpression Id. */
  int FACTOR = 9;
  /** RegularExpression Id. */
  int SIGN = 10;
  /** RegularExpression Id. */
  int DOT = 11;
  /** RegularExpression Id. */
  int SOLIDUS = 12;
  /** RegularExpression Id. */
  int ATOM = 13;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<ATOM_CHAR>",
    "<ESCAPED_ATOM_CHAR>",
    "<TERMINAL_ATOM_CHAR>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANNOTATION>",
    "<FACTOR>",
    "<SIGN>",
    "\".\"",
    "\"/\"",
    "<ATOM>",
    "\"(\"",
    "\")\"",
  };

}