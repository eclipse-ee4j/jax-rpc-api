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

package javax.xml.rpc.handler.soap;

import javax.xml.rpc.JAXRPCException;
import javax.xml.soap.SOAPMessage;

/** The interface <code>javax.xml.rpc.soap.SOAPMessageContext</code> 
 *  provides access to the SOAP message for either RPC request or 
 *  response. The <code>javax.xml.soap.SOAPMessage</code> specifies
 *  the standard Java API for the representation of a SOAP 1.1 message
 *  with attachments.
 *
 *  @version 1.0
 *  @author  Rahul Sharma
 *  @see javax.xml.soap.SOAPMessage
**/

public interface SOAPMessageContext 
                    extends javax.xml.rpc.handler.MessageContext {

  /** Gets the SOAPMessage from this message context
   *
   *  @return Returns the SOAPMessage; returns null if no 
   *          SOAPMessage is present in this message context
  **/
  public SOAPMessage getMessage();
  
  /** Sets the SOAPMessage in this message context
   *
   *  @param  message SOAP message
   *  @throws JAXRPCException If any error during the setting
   *          of the SOAPMessage in this message context
   *  @throws java.lang.UnsupportedOperationException If this
   *          operation is not supported
  **/
  public void setMessage(SOAPMessage message);

  /** Gets the SOAP actor roles associated with an execution
   *  of the HandlerChain and its contained Handler instances.
   *  Note that SOAP actor roles apply to the SOAP node and
   *  are managed using <code>HandlerChain.setRoles</code> and
   *  <code>HandlerChain.getRoles</code>. Handler instances in
   *  the HandlerChain use this information about the SOAP actor
   *  roles to process the SOAP header blocks. Note that the
   *  SOAP actor roles are invariant during the processing of
   *  SOAP message through the HandlerChain.
   *
   *  @return Array of URIs for SOAP actor roles
   *  @see javax.xml.rpc.handler.HandlerChain#setRoles
   *  @see javax.xml.rpc.handler.HandlerChain#getRoles
  **/
  public String[] getRoles();

}
