//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.03 at 09:49:42 AM CET 
//
package bzh.terrevirtuelle.navisu.domain.gpx.model;

import bzh.terrevirtuelle.navisu.domain.navigation.NavigationData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 *
 * You can add extend GPX by adding your own elements from another schema here.
 *
 *
 * <p>
 * Java class for extensionsType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="extensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "highway", propOrder = {
    "bounds"
})
public class Highway implements NavigationData {

    @XmlElement
    protected List<Point> bounds;

    public Highway() {
        bounds = new ArrayList<>();
    }

    public Highway(List<Point> bounds) {
        this.bounds = bounds;
    }

    /**
     * Gets the value of the any property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the any property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list null null     {@link Object }
     * {@link Element }
     *
     *
     * @return
     */
    public List<Point> getBounds() {
        if (bounds == null) {
            bounds = new ArrayList<>();
        }
        return this.bounds;
    }

    @Override
    public String toString() {
        return "Highway{" + "bounds=" + bounds + '}';
    }

    @Override
    public String getGeometry() {
        String geom = "MULTIPOINT(";
        int size = bounds.size() - 1;
        for (int i = 0; i < size; i++) {
            geom += bounds.get(i).longitude + " " + bounds.get(i).latitude;
            geom += ",";
        }
        geom += bounds.get(size - 1).longitude + " " + bounds.get(size - 1).latitude + ")";

        return geom;
    }

}
