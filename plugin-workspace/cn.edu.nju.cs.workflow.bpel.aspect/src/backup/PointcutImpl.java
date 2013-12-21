/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package backup;

import cn.edu.nju.cs.workflow.model.aspect.AspectPackage;
import cn.edu.nju.cs.workflow.model.aspect.Pointcut;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectConstants;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectReconciliationHelper;

import org.eclipse.bpel.model.Expression;

import org.eclipse.bpel.model.impl.BPELExtensibleElementImpl;
import org.eclipse.bpel.model.util.ReconciliationHelper;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl#getStartpoint <em>Startpoint</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link cn.edu.nju.cs.workflow.model.aspect.impl.PointcutImpl#getPoint <em>Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointcutImpl extends BPELExtensibleElementImpl implements Pointcut {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0";

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartpoint() <em>Startpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartpoint()
	 * @generated
	 * @ordered
	 */
	protected Expression startpoint;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Expression endpoint;

	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected Expression point;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointcutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectPackage.Literals.POINTCUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		if(!isReconciling){
			ReconciliationHelper.replaceAttribute(this, AspectConstants.AT_LANGUAGE,
					newLanguage);
		}
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStartpoint() {
		return startpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public NotificationChain basicSetStartpoint(Expression newStartpoint, NotificationChain msgs) {
		Expression oldStartpoint = startpoint;
		
		if (!isReconciling) {
			AspectReconciliationHelper.replaceChild(this, oldStartpoint,
					newStartpoint);
		}
		startpoint = newStartpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__STARTPOINT, oldStartpoint, newStartpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public void setStartpoint(Expression newStartpoint) {
		if (newStartpoint != startpoint) {
			NotificationChain msgs = null;
			if (startpoint != null)
				msgs = ((InternalEObject)startpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.POINTCUT__STARTPOINT, null, msgs);
			if (newStartpoint != null)
				msgs = ((InternalEObject)newStartpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.POINTCUT__STARTPOINT, null, msgs);
			msgs = basicSetStartpoint(newStartpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__STARTPOINT, newStartpoint, newStartpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public NotificationChain basicSetEndpoint(Expression newEndpoint, NotificationChain msgs) {
		Expression oldEndpoint = endpoint;
		if (!isReconciling) {
			AspectReconciliationHelper.replaceChild(this, oldEndpoint,
					newEndpoint);
		}
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__ENDPOINT, oldEndpoint, newEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public void setEndpoint(Expression newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.POINTCUT__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.POINTCUT__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPoint() {
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public NotificationChain basicSetPoint(Expression newPoint, NotificationChain msgs) {
		Expression oldPoint = point;
		if (!isReconciling) {
			AspectReconciliationHelper.replaceChild(this, oldPoint,
					newPoint);
		}
		point = newPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__POINT, oldPoint, newPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	public void setPoint(Expression newPoint) {
		if (newPoint != point) {
			NotificationChain msgs = null;
			if (point != null)
				msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectPackage.POINTCUT__POINT, null, msgs);
			if (newPoint != null)
				msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectPackage.POINTCUT__POINT, null, msgs);
			msgs = basicSetPoint(newPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectPackage.POINTCUT__POINT, newPoint, newPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectPackage.POINTCUT__STARTPOINT:
				return basicSetStartpoint(null, msgs);
			case AspectPackage.POINTCUT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case AspectPackage.POINTCUT__POINT:
				return basicSetPoint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectPackage.POINTCUT__NAME:
				return getName();
			case AspectPackage.POINTCUT__LANGUAGE:
				return getLanguage();
			case AspectPackage.POINTCUT__STARTPOINT:
				return getStartpoint();
			case AspectPackage.POINTCUT__ENDPOINT:
				return getEndpoint();
			case AspectPackage.POINTCUT__POINT:
				return getPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectPackage.POINTCUT__NAME:
				setName((String)newValue);
				return;
			case AspectPackage.POINTCUT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case AspectPackage.POINTCUT__STARTPOINT:
				setStartpoint((Expression)newValue);
				return;
			case AspectPackage.POINTCUT__ENDPOINT:
				setEndpoint((Expression)newValue);
				return;
			case AspectPackage.POINTCUT__POINT:
				setPoint((Expression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AspectPackage.POINTCUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AspectPackage.POINTCUT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case AspectPackage.POINTCUT__STARTPOINT:
				setStartpoint((Expression)null);
				return;
			case AspectPackage.POINTCUT__ENDPOINT:
				setEndpoint((Expression)null);
				return;
			case AspectPackage.POINTCUT__POINT:
				setPoint((Expression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AspectPackage.POINTCUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AspectPackage.POINTCUT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case AspectPackage.POINTCUT__STARTPOINT:
				return startpoint != null;
			case AspectPackage.POINTCUT__ENDPOINT:
				return endpoint != null;
			case AspectPackage.POINTCUT__POINT:
				return point != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("restriction")
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //PointcutImpl
