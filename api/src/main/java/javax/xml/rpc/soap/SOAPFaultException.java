/*
 * Copyright (c) 2003, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.xml.rpc.soap;


import javax.xml.namespace.QName;
import javax.xml.soap.Detail;

/** The <code>SOAPFaultException</code> exception represents a 
 *  SOAP fault.
 *
 *  <p>The message part in the SOAP fault maps to the contents of
 *  <code>faultdetail</code> element accessible through the 
 *  <code>getDetail</code> method on the <code>SOAPFaultException</code>.
 *  The method <code>createDetail</code> on the 
 *  <code>javax.xml.soap.SOAPFactory</code> creates an instance 
 *  of the <code>javax.xml.soap.Detail</code>. 
 *
 *  <p>The <code>faultstring</code> provides a human-readable 
 *  description of the SOAP fault. The <code>faultcode</code> 
 *  element provides an algorithmic mapping of the SOAP fault.
 * 
 *  <p>Refer to SOAP 1.1 and WSDL 1.1 specifications for more
 *  details of the SOAP faults. 
 *
 *  @version 1.0
 *  @author  Rahul Sharma
 *  @see javax.xml.soap.Detail
 *  @see javax.xml.soap.SOAPFactory#createDetail
**/

public class SOAPFaultException extends java.lang.RuntimeException  {
  
  private QName faultcode;
  private String faultstring;
  private String faultactor;
  private Detail detail;

  /** Constructor for the SOAPFaultException
   *  @param faultcode   <code>QName</code> for the SOAP faultcode
   *  @param faultstring <code>faultstring</code> element of SOAP fault 
   *  @param faultactor  <code>faultactor</code> element of SOAP fault
   *  @param faultdetail <code>faultdetail</code> element of SOAP fault 
   *
   *  @see javax.xml.soap.SOAPFactory#createDetail
  **/
  public SOAPFaultException(QName faultcode,
		   String faultstring,
		   String faultactor,
		   javax.xml.soap.Detail faultdetail) { 
    super(faultstring);
    this.faultcode = faultcode;
    this.faultstring = faultstring;
    this.faultactor = faultactor;
    this.detail = faultdetail;
  }

  /** Gets the <code>faultcode</code> element. The <code>faultcode</code>
   *  element provides an algorithmic mechanism for identifying the
   *  fault. SOAP defines a small set of SOAP fault codes covering 
   *  basic SOAP faults.
   *
   *  @return QName of the faultcode element
  **/
  public QName getFaultCode() {
    return this.faultcode;
  }

  /** Gets the <code>faultstring</code> element. The <code>faultstring</code>
   *  provides a human-readable description of the SOAP fault and 
   *  is not intended for algorithmic processing.
   *
   *  @return faultstring element of the SOAP fault
  **/
  public String getFaultString() {
    return this.faultstring;
  }

  /** Gets the <code>faultactor</code> element. The <code>faultactor</code>
   *  element provides information about which SOAP node on the 
   *  SOAP message path caused the fault to happen. It indicates 
   *  the source of the fault.
   * 
   *  @return <code>faultactor</code> element of the SOAP fault 
  **/
  public String getFaultActor() {
    return this.faultactor;
  }

  /** Gets the detail element. The detail element is intended for
   *  carrying application specific error information related to
   *  the SOAP Body.
   *
   *  @return <code>detail</code> element of the SOAP fault
   *  @see javax.xml.soap.Detail
  **/
  public Detail getDetail() {
    return this.detail;
  }
}
