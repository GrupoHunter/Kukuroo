/**
 */
package org.miniGobstones.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.miniGobstones.Booleans;
import org.miniGobstones.Command;
import org.miniGobstones.If;
import org.miniGobstones.MiniGobstonesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.miniGobstones.impl.IfImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.miniGobstones.impl.IfImpl#getCommandsThen <em>Commands Then</em>}</li>
 *   <li>{@link org.miniGobstones.impl.IfImpl#getCommandsElse <em>Commands Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfImpl extends CommandImpl implements If
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Booleans expr;

  /**
   * The cached value of the '{@link #getCommandsThen() <em>Commands Then</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandsThen()
   * @generated
   * @ordered
   */
  protected EList<Command> commandsThen;

  /**
   * The cached value of the '{@link #getCommandsElse() <em>Commands Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandsElse()
   * @generated
   * @ordered
   */
  protected EList<Command> commandsElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniGobstonesPackage.Literals.IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Booleans getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Booleans newExpr, NotificationChain msgs)
  {
    Booleans oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.IF__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Booleans newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniGobstonesPackage.IF__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniGobstonesPackage.IF__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniGobstonesPackage.IF__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommandsThen()
  {
    if (commandsThen == null)
    {
      commandsThen = new EObjectContainmentEList<Command>(Command.class, this, MiniGobstonesPackage.IF__COMMANDS_THEN);
    }
    return commandsThen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommandsElse()
  {
    if (commandsElse == null)
    {
      commandsElse = new EObjectContainmentEList<Command>(Command.class, this, MiniGobstonesPackage.IF__COMMANDS_ELSE);
    }
    return commandsElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.IF__EXPR:
        return basicSetExpr(null, msgs);
      case MiniGobstonesPackage.IF__COMMANDS_THEN:
        return ((InternalEList<?>)getCommandsThen()).basicRemove(otherEnd, msgs);
      case MiniGobstonesPackage.IF__COMMANDS_ELSE:
        return ((InternalEList<?>)getCommandsElse()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.IF__EXPR:
        return getExpr();
      case MiniGobstonesPackage.IF__COMMANDS_THEN:
        return getCommandsThen();
      case MiniGobstonesPackage.IF__COMMANDS_ELSE:
        return getCommandsElse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.IF__EXPR:
        setExpr((Booleans)newValue);
        return;
      case MiniGobstonesPackage.IF__COMMANDS_THEN:
        getCommandsThen().clear();
        getCommandsThen().addAll((Collection<? extends Command>)newValue);
        return;
      case MiniGobstonesPackage.IF__COMMANDS_ELSE:
        getCommandsElse().clear();
        getCommandsElse().addAll((Collection<? extends Command>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.IF__EXPR:
        setExpr((Booleans)null);
        return;
      case MiniGobstonesPackage.IF__COMMANDS_THEN:
        getCommandsThen().clear();
        return;
      case MiniGobstonesPackage.IF__COMMANDS_ELSE:
        getCommandsElse().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniGobstonesPackage.IF__EXPR:
        return expr != null;
      case MiniGobstonesPackage.IF__COMMANDS_THEN:
        return commandsThen != null && !commandsThen.isEmpty();
      case MiniGobstonesPackage.IF__COMMANDS_ELSE:
        return commandsElse != null && !commandsElse.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IfImpl
