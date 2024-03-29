/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ezbake.frack.common.utils.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides information needed for adding, registering, a document with the
 * Provenance service.
 */
public class ProvenanceRegistration implements org.apache.thrift.TBase<ProvenanceRegistration, ProvenanceRegistration._Fields>, java.io.Serializable, Cloneable, Comparable<ProvenanceRegistration> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProvenanceRegistration");

  private static final org.apache.thrift.protocol.TField URI_FIELD_DESC = new org.apache.thrift.protocol.TField("uri", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("parents", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField AGE_OFF_RULES_FIELD_DESC = new org.apache.thrift.protocol.TField("ageOffRules", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProvenanceRegistrationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProvenanceRegistrationTupleSchemeFactory());
  }

  /**
   * The URI assigned to the document. The URI uniquely identifies the document
   * to which it is assigned.
   */
  public String uri; // required
  /**
   * A collection of documents from which this document, identified by the URI,
   * was derived.
   */
  public List<ezbake.services.provenance.thrift.InheritanceInfo> parents; // optional
  /**
   * A collection of rules that determine when this document will be aged off.
   */
  public List<ezbake.services.provenance.thrift.AgeOffMapping> ageOffRules; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The URI assigned to the document. The URI uniquely identifies the document
     * to which it is assigned.
     */
    URI((short)1, "uri"),
    /**
     * A collection of documents from which this document, identified by the URI,
     * was derived.
     */
    PARENTS((short)2, "parents"),
    /**
     * A collection of rules that determine when this document will be aged off.
     */
    AGE_OFF_RULES((short)3, "ageOffRules");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // URI
          return URI;
        case 2: // PARENTS
          return PARENTS;
        case 3: // AGE_OFF_RULES
          return AGE_OFF_RULES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.PARENTS,_Fields.AGE_OFF_RULES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.URI, new org.apache.thrift.meta_data.FieldMetaData("uri", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARENTS, new org.apache.thrift.meta_data.FieldMetaData("parents", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ezbake.services.provenance.thrift.InheritanceInfo.class))));
    tmpMap.put(_Fields.AGE_OFF_RULES, new org.apache.thrift.meta_data.FieldMetaData("ageOffRules", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ezbake.services.provenance.thrift.AgeOffMapping.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProvenanceRegistration.class, metaDataMap);
  }

  public ProvenanceRegistration() {
  }

  public ProvenanceRegistration(
    String uri)
  {
    this();
    this.uri = uri;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProvenanceRegistration(ProvenanceRegistration other) {
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
    if (other.isSetParents()) {
      List<ezbake.services.provenance.thrift.InheritanceInfo> __this__parents = new ArrayList<ezbake.services.provenance.thrift.InheritanceInfo>(other.parents.size());
      for (ezbake.services.provenance.thrift.InheritanceInfo other_element : other.parents) {
        __this__parents.add(new ezbake.services.provenance.thrift.InheritanceInfo(other_element));
      }
      this.parents = __this__parents;
    }
    if (other.isSetAgeOffRules()) {
      List<ezbake.services.provenance.thrift.AgeOffMapping> __this__ageOffRules = new ArrayList<ezbake.services.provenance.thrift.AgeOffMapping>(other.ageOffRules.size());
      for (ezbake.services.provenance.thrift.AgeOffMapping other_element : other.ageOffRules) {
        __this__ageOffRules.add(new ezbake.services.provenance.thrift.AgeOffMapping(other_element));
      }
      this.ageOffRules = __this__ageOffRules;
    }
  }

  public ProvenanceRegistration deepCopy() {
    return new ProvenanceRegistration(this);
  }

  @Override
  public void clear() {
    this.uri = null;
    this.parents = null;
    this.ageOffRules = null;
  }

  /**
   * The URI assigned to the document. The URI uniquely identifies the document
   * to which it is assigned.
   */
  public String getUri() {
    return this.uri;
  }

  /**
   * The URI assigned to the document. The URI uniquely identifies the document
   * to which it is assigned.
   */
  public ProvenanceRegistration setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public void unsetUri() {
    this.uri = null;
  }

  /** Returns true if field uri is set (has been assigned a value) and false otherwise */
  public boolean isSetUri() {
    return this.uri != null;
  }

  public void setUriIsSet(boolean value) {
    if (!value) {
      this.uri = null;
    }
  }

  public int getParentsSize() {
    return (this.parents == null) ? 0 : this.parents.size();
  }

  public java.util.Iterator<ezbake.services.provenance.thrift.InheritanceInfo> getParentsIterator() {
    return (this.parents == null) ? null : this.parents.iterator();
  }

  public void addToParents(ezbake.services.provenance.thrift.InheritanceInfo elem) {
    if (this.parents == null) {
      this.parents = new ArrayList<ezbake.services.provenance.thrift.InheritanceInfo>();
    }
    this.parents.add(elem);
  }

  /**
   * A collection of documents from which this document, identified by the URI,
   * was derived.
   */
  public List<ezbake.services.provenance.thrift.InheritanceInfo> getParents() {
    return this.parents;
  }

  /**
   * A collection of documents from which this document, identified by the URI,
   * was derived.
   */
  public ProvenanceRegistration setParents(List<ezbake.services.provenance.thrift.InheritanceInfo> parents) {
    this.parents = parents;
    return this;
  }

  public void unsetParents() {
    this.parents = null;
  }

  /** Returns true if field parents is set (has been assigned a value) and false otherwise */
  public boolean isSetParents() {
    return this.parents != null;
  }

  public void setParentsIsSet(boolean value) {
    if (!value) {
      this.parents = null;
    }
  }

  public int getAgeOffRulesSize() {
    return (this.ageOffRules == null) ? 0 : this.ageOffRules.size();
  }

  public java.util.Iterator<ezbake.services.provenance.thrift.AgeOffMapping> getAgeOffRulesIterator() {
    return (this.ageOffRules == null) ? null : this.ageOffRules.iterator();
  }

  public void addToAgeOffRules(ezbake.services.provenance.thrift.AgeOffMapping elem) {
    if (this.ageOffRules == null) {
      this.ageOffRules = new ArrayList<ezbake.services.provenance.thrift.AgeOffMapping>();
    }
    this.ageOffRules.add(elem);
  }

  /**
   * A collection of rules that determine when this document will be aged off.
   */
  public List<ezbake.services.provenance.thrift.AgeOffMapping> getAgeOffRules() {
    return this.ageOffRules;
  }

  /**
   * A collection of rules that determine when this document will be aged off.
   */
  public ProvenanceRegistration setAgeOffRules(List<ezbake.services.provenance.thrift.AgeOffMapping> ageOffRules) {
    this.ageOffRules = ageOffRules;
    return this;
  }

  public void unsetAgeOffRules() {
    this.ageOffRules = null;
  }

  /** Returns true if field ageOffRules is set (has been assigned a value) and false otherwise */
  public boolean isSetAgeOffRules() {
    return this.ageOffRules != null;
  }

  public void setAgeOffRulesIsSet(boolean value) {
    if (!value) {
      this.ageOffRules = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case URI:
      if (value == null) {
        unsetUri();
      } else {
        setUri((String)value);
      }
      break;

    case PARENTS:
      if (value == null) {
        unsetParents();
      } else {
        setParents((List<ezbake.services.provenance.thrift.InheritanceInfo>)value);
      }
      break;

    case AGE_OFF_RULES:
      if (value == null) {
        unsetAgeOffRules();
      } else {
        setAgeOffRules((List<ezbake.services.provenance.thrift.AgeOffMapping>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URI:
      return getUri();

    case PARENTS:
      return getParents();

    case AGE_OFF_RULES:
      return getAgeOffRules();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case URI:
      return isSetUri();
    case PARENTS:
      return isSetParents();
    case AGE_OFF_RULES:
      return isSetAgeOffRules();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProvenanceRegistration)
      return this.equals((ProvenanceRegistration)that);
    return false;
  }

  public boolean equals(ProvenanceRegistration that) {
    if (that == null)
      return false;

    boolean this_present_uri = true && this.isSetUri();
    boolean that_present_uri = true && that.isSetUri();
    if (this_present_uri || that_present_uri) {
      if (!(this_present_uri && that_present_uri))
        return false;
      if (!this.uri.equals(that.uri))
        return false;
    }

    boolean this_present_parents = true && this.isSetParents();
    boolean that_present_parents = true && that.isSetParents();
    if (this_present_parents || that_present_parents) {
      if (!(this_present_parents && that_present_parents))
        return false;
      if (!this.parents.equals(that.parents))
        return false;
    }

    boolean this_present_ageOffRules = true && this.isSetAgeOffRules();
    boolean that_present_ageOffRules = true && that.isSetAgeOffRules();
    if (this_present_ageOffRules || that_present_ageOffRules) {
      if (!(this_present_ageOffRules && that_present_ageOffRules))
        return false;
      if (!this.ageOffRules.equals(that.ageOffRules))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ProvenanceRegistration other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUri()).compareTo(other.isSetUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uri, other.uri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParents()).compareTo(other.isSetParents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parents, other.parents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAgeOffRules()).compareTo(other.isSetAgeOffRules());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgeOffRules()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ageOffRules, other.ageOffRules);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ProvenanceRegistration(");
    boolean first = true;

    sb.append("uri:");
    if (this.uri == null) {
      sb.append("null");
    } else {
      sb.append(this.uri);
    }
    first = false;
    if (isSetParents()) {
      if (!first) sb.append(", ");
      sb.append("parents:");
      if (this.parents == null) {
        sb.append("null");
      } else {
        sb.append(this.parents);
      }
      first = false;
    }
    if (isSetAgeOffRules()) {
      if (!first) sb.append(", ");
      sb.append("ageOffRules:");
      if (this.ageOffRules == null) {
        sb.append("null");
      } else {
        sb.append(this.ageOffRules);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uri == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uri' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProvenanceRegistrationStandardSchemeFactory implements SchemeFactory {
    public ProvenanceRegistrationStandardScheme getScheme() {
      return new ProvenanceRegistrationStandardScheme();
    }
  }

  private static class ProvenanceRegistrationStandardScheme extends StandardScheme<ProvenanceRegistration> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProvenanceRegistration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uri = iprot.readString();
              struct.setUriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.parents = new ArrayList<ezbake.services.provenance.thrift.InheritanceInfo>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  ezbake.services.provenance.thrift.InheritanceInfo _elem2;
                  _elem2 = new ezbake.services.provenance.thrift.InheritanceInfo();
                  _elem2.read(iprot);
                  struct.parents.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setParentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AGE_OFF_RULES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.ageOffRules = new ArrayList<ezbake.services.provenance.thrift.AgeOffMapping>(_list3.size);
                for (int _i4 = 0; _i4 < _list3.size; ++_i4)
                {
                  ezbake.services.provenance.thrift.AgeOffMapping _elem5;
                  _elem5 = new ezbake.services.provenance.thrift.AgeOffMapping();
                  _elem5.read(iprot);
                  struct.ageOffRules.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setAgeOffRulesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProvenanceRegistration struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uri != null) {
        oprot.writeFieldBegin(URI_FIELD_DESC);
        oprot.writeString(struct.uri);
        oprot.writeFieldEnd();
      }
      if (struct.parents != null) {
        if (struct.isSetParents()) {
          oprot.writeFieldBegin(PARENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.parents.size()));
            for (ezbake.services.provenance.thrift.InheritanceInfo _iter6 : struct.parents)
            {
              _iter6.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.ageOffRules != null) {
        if (struct.isSetAgeOffRules()) {
          oprot.writeFieldBegin(AGE_OFF_RULES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ageOffRules.size()));
            for (ezbake.services.provenance.thrift.AgeOffMapping _iter7 : struct.ageOffRules)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProvenanceRegistrationTupleSchemeFactory implements SchemeFactory {
    public ProvenanceRegistrationTupleScheme getScheme() {
      return new ProvenanceRegistrationTupleScheme();
    }
  }

  private static class ProvenanceRegistrationTupleScheme extends TupleScheme<ProvenanceRegistration> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProvenanceRegistration struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.uri);
      BitSet optionals = new BitSet();
      if (struct.isSetParents()) {
        optionals.set(0);
      }
      if (struct.isSetAgeOffRules()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetParents()) {
        {
          oprot.writeI32(struct.parents.size());
          for (ezbake.services.provenance.thrift.InheritanceInfo _iter8 : struct.parents)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetAgeOffRules()) {
        {
          oprot.writeI32(struct.ageOffRules.size());
          for (ezbake.services.provenance.thrift.AgeOffMapping _iter9 : struct.ageOffRules)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProvenanceRegistration struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uri = iprot.readString();
      struct.setUriIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.parents = new ArrayList<ezbake.services.provenance.thrift.InheritanceInfo>(_list10.size);
          for (int _i11 = 0; _i11 < _list10.size; ++_i11)
          {
            ezbake.services.provenance.thrift.InheritanceInfo _elem12;
            _elem12 = new ezbake.services.provenance.thrift.InheritanceInfo();
            _elem12.read(iprot);
            struct.parents.add(_elem12);
          }
        }
        struct.setParentsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.ageOffRules = new ArrayList<ezbake.services.provenance.thrift.AgeOffMapping>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            ezbake.services.provenance.thrift.AgeOffMapping _elem15;
            _elem15 = new ezbake.services.provenance.thrift.AgeOffMapping();
            _elem15.read(iprot);
            struct.ageOffRules.add(_elem15);
          }
        }
        struct.setAgeOffRulesIsSet(true);
      }
    }
  }

}

