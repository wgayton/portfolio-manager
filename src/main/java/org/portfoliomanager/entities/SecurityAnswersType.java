
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for securityAnswersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityAnswersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityAnswer" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="question" type="{}questionType"/>
 *                   &lt;element name="answer">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityAnswersType", propOrder = {
    "securityAnswer"
})
public class SecurityAnswersType {

    protected List<SecurityAnswersType.SecurityAnswer> securityAnswer;

    /**
     * Gets the value of the securityAnswer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityAnswer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityAnswer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityAnswersType.SecurityAnswer }
     *
     *
     */
    public List<SecurityAnswersType.SecurityAnswer> getSecurityAnswer() {
        if (securityAnswer == null) {
            securityAnswer = new ArrayList<SecurityAnswersType.SecurityAnswer>();
        }
        return this.securityAnswer;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="question" type="{}questionType"/>
     *         &lt;element name="answer">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "question",
        "answer"
    })
    public static class SecurityAnswer {

        @XmlElement(required = true)
        protected QuestionType question;
        @XmlElement(required = true)
        protected String answer;

        /**
         * Gets the value of the question property.
         *
         * @return
         *     possible object is
         *     {@link QuestionType }
         *
         */
        public QuestionType getQuestion() {
            return question;
        }

        /**
         * Sets the value of the question property.
         *
         * @param value
         *     allowed object is
         *     {@link QuestionType }
         *
         */
        public void setQuestion(QuestionType value) {
            this.question = value;
        }

        /**
         * Gets the value of the answer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnswer() {
            return answer;
        }

        /**
         * Sets the value of the answer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnswer(String value) {
            this.answer = value;
        }

    }

}
