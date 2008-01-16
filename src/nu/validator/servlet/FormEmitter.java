/* This code was generated by nu.validator.tools.SaxCompiler. Please regenerate instead of editing. */
package nu.validator.servlet;
public final class FormEmitter {
private FormEmitter() {}
public static void emit(org.xml.sax.ContentHandler contentHandler, nu.validator.servlet.VerifierServletTransaction t) throws org.xml.sax.SAXException {
org.xml.sax.helpers.AttributesImpl __attrs__ = new org.xml.sax.helpers.AttributesImpl();
contentHandler.startPrefixMapping("", "http://www.w3.org/1999/xhtml");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "fieldset", "fieldset", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "legend", "legend", __attrs__);
contentHandler.characters(__chars__, 0, 15);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "legend", "legend");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "table", "table", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tbody", "tbody", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "title", "title", "CDATA", "The document to validate.");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "doc");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
contentHandler.characters(__chars__, 15, 8);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
t.emitDocField(); 
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
t.maybeEmitCharsetField(); 
__attrs__.clear();
__attrs__.addAttribute("", "title", "title", "CDATA", "Space-separated list of schema IRIs. (Leave blank to let the service guess.)");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "schema");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
contentHandler.characters(__chars__, 23, 7);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
t.emitSchemaField(); 
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
__attrs__.clear();
__attrs__.addAttribute("", "title", "title", "CDATA", "Selecting a preset overrides the schema field above.");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "preset");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
contentHandler.characters(__chars__, 30, 6);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "id", "id", "CDATA", "preset");
__attrs__.addAttribute("", "name", "name", "CDATA", "preset");
__attrs__.addAttribute("", "onchange", "onchange", "CDATA", "presetChanged()");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "select", "select", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "value", "value", "CDATA", "");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "option", "option", __attrs__);
contentHandler.characters(__chars__, 36, 4);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "option", "option");
t.emitPresetOptions(); 
						
contentHandler.endElement("http://www.w3.org/1999/xhtml", "select", "select");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
__attrs__.clear();
__attrs__.addAttribute("", "title", "title", "CDATA", "The parser to use. Affects HTTP Accept header.");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "parser");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
contentHandler.characters(__chars__, 40, 6);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "id", "id", "CDATA", "parser");
__attrs__.addAttribute("", "name", "name", "CDATA", "parser");
__attrs__.addAttribute("", "onchange", "onchange", "CDATA", "parserChanged()");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "select", "select", __attrs__);
t.emitParserOptions(); 
						
contentHandler.endElement("http://www.w3.org/1999/xhtml", "select", "select");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
t.maybeEmitNsfilterField(); 
__attrs__.clear();
__attrs__.addAttribute("", "title", "title", "CDATA", "Disrespect MIME RFCs.");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "laxtype");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
t.emitLaxTypeField(); 
						
contentHandler.characters(__chars__, 46, 31);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
__attrs__.clear();
__attrs__.addAttribute("", "title", "title", "CDATA", "Display the markup source of the input document.");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "showsource");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
t.emitShowSourceField(); 
						
contentHandler.characters(__chars__, 77, 12);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "tr", "tr", __attrs__);
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "name", "name", "CDATA", "submit");
__attrs__.addAttribute("", "value", "value", "CDATA", "Validate");
__attrs__.addAttribute("", "type", "type", "CDATA", "submit");
__attrs__.addAttribute("", "id", "id", "CDATA", "submit");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "input", "input", __attrs__);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "input", "input");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tr", "tr");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "tbody", "tbody");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "table", "table");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "fieldset", "fieldset");
contentHandler.endPrefixMapping("");
}
private static final char[] __chars__ = { 'V', 'a', 'l', 'i', 'd', 'a', 't', 'o', 'r', ' ', 'I', 'n', 'p', 'u', 't', 'D', 'o', 'c', 'u', 'm', 'e', 'n', 't', 'S', 'c', 'h', 'e', 'm', 'a', 's', 'P', 'r', 'e', 's', 'e', 't', 'N', 'o', 'n', 'e', 'P', 'a', 'r', 's', 'e', 'r', ' ', 'B', 'e', ' ', 'l', 'a', 'x', ' ', 'a', 'b', 'o', 'u', 't', ' ', 'H', 'T', 'T', 'P', ' ', 'C', 'o', 'n', 't', 'e', 'n', 't', '-', 'T', 'y', 'p', 'e', ' ', 'S', 'h', 'o', 'w', ' ', 'S', 'o', 'u', 'r', 'c', 'e' };
}
