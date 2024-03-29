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

public class BroadcastMetadata implements org.apache.thrift.TBase<BroadcastMetadata, BroadcastMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<BroadcastMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BroadcastMetadata");

  private static final org.apache.thrift.protocol.TField VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("visibility", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField WAREHOUSE_URI_FIELD_DESC = new org.apache.thrift.protocol.TField("warehouseUri", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GUIDE_FIELD_DESC = new org.apache.thrift.protocol.TField("guide", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BroadcastMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BroadcastMetadataTupleSchemeFactory());
  }

  public ezbake.base.thrift.Visibility visibility; // required
  public String warehouseUri; // required
  public String guide; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VISIBILITY((short)1, "visibility"),
    WAREHOUSE_URI((short)2, "warehouseUri"),
    GUIDE((short)3, "guide");

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
        case 1: // VISIBILITY
          return VISIBILITY;
        case 2: // WAREHOUSE_URI
          return WAREHOUSE_URI;
        case 3: // GUIDE
          return GUIDE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("visibility", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ezbake.base.thrift.Visibility.class)));
    tmpMap.put(_Fields.WAREHOUSE_URI, new org.apache.thrift.meta_data.FieldMetaData("warehouseUri", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GUIDE, new org.apache.thrift.meta_data.FieldMetaData("guide", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BroadcastMetadata.class, metaDataMap);
  }

  public BroadcastMetadata() {
  }

  public BroadcastMetadata(
    ezbake.base.thrift.Visibility visibility,
    String warehouseUri,
    String guide)
  {
    this();
    this.visibility = visibility;
    this.warehouseUri = warehouseUri;
    this.guide = guide;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BroadcastMetadata(BroadcastMetadata other) {
    if (other.isSetVisibility()) {
      this.visibility = new ezbake.base.thrift.Visibility(other.visibility);
    }
    if (other.isSetWarehouseUri()) {
      this.warehouseUri = other.warehouseUri;
    }
    if (other.isSetGuide()) {
      this.guide = other.guide;
    }
  }

  public BroadcastMetadata deepCopy() {
    return new BroadcastMetadata(this);
  }

  @Override
  public void clear() {
    this.visibility = null;
    this.warehouseUri = null;
    this.guide = null;
  }

  public ezbake.base.thrift.Visibility getVisibility() {
    return this.visibility;
  }

  public BroadcastMetadata setVisibility(ezbake.base.thrift.Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  public void unsetVisibility() {
    this.visibility = null;
  }

  /** Returns true if field visibility is set (has been assigned a value) and false otherwise */
  public boolean isSetVisibility() {
    return this.visibility != null;
  }

  public void setVisibilityIsSet(boolean value) {
    if (!value) {
      this.visibility = null;
    }
  }

  public String getWarehouseUri() {
    return this.warehouseUri;
  }

  public BroadcastMetadata setWarehouseUri(String warehouseUri) {
    this.warehouseUri = warehouseUri;
    return this;
  }

  public void unsetWarehouseUri() {
    this.warehouseUri = null;
  }

  /** Returns true if field warehouseUri is set (has been assigned a value) and false otherwise */
  public boolean isSetWarehouseUri() {
    return this.warehouseUri != null;
  }

  public void setWarehouseUriIsSet(boolean value) {
    if (!value) {
      this.warehouseUri = null;
    }
  }

  public String getGuide() {
    return this.guide;
  }

  public BroadcastMetadata setGuide(String guide) {
    this.guide = guide;
    return this;
  }

  public void unsetGuide() {
    this.guide = null;
  }

  /** Returns true if field guide is set (has been assigned a value) and false otherwise */
  public boolean isSetGuide() {
    return this.guide != null;
  }

  public void setGuideIsSet(boolean value) {
    if (!value) {
      this.guide = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VISIBILITY:
      if (value == null) {
        unsetVisibility();
      } else {
        setVisibility((ezbake.base.thrift.Visibility)value);
      }
      break;

    case WAREHOUSE_URI:
      if (value == null) {
        unsetWarehouseUri();
      } else {
        setWarehouseUri((String)value);
      }
      break;

    case GUIDE:
      if (value == null) {
        unsetGuide();
      } else {
        setGuide((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VISIBILITY:
      return getVisibility();

    case WAREHOUSE_URI:
      return getWarehouseUri();

    case GUIDE:
      return getGuide();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VISIBILITY:
      return isSetVisibility();
    case WAREHOUSE_URI:
      return isSetWarehouseUri();
    case GUIDE:
      return isSetGuide();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BroadcastMetadata)
      return this.equals((BroadcastMetadata)that);
    return false;
  }

  public boolean equals(BroadcastMetadata that) {
    if (that == null)
      return false;

    boolean this_present_visibility = true && this.isSetVisibility();
    boolean that_present_visibility = true && that.isSetVisibility();
    if (this_present_visibility || that_present_visibility) {
      if (!(this_present_visibility && that_present_visibility))
        return false;
      if (!this.visibility.equals(that.visibility))
        return false;
    }

    boolean this_present_warehouseUri = true && this.isSetWarehouseUri();
    boolean that_present_warehouseUri = true && that.isSetWarehouseUri();
    if (this_present_warehouseUri || that_present_warehouseUri) {
      if (!(this_present_warehouseUri && that_present_warehouseUri))
        return false;
      if (!this.warehouseUri.equals(that.warehouseUri))
        return false;
    }

    boolean this_present_guide = true && this.isSetGuide();
    boolean that_present_guide = true && that.isSetGuide();
    if (this_present_guide || that_present_guide) {
      if (!(this_present_guide && that_present_guide))
        return false;
      if (!this.guide.equals(that.guide))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(BroadcastMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetVisibility()).compareTo(other.isSetVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.visibility, other.visibility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWarehouseUri()).compareTo(other.isSetWarehouseUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWarehouseUri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.warehouseUri, other.warehouseUri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuide()).compareTo(other.isSetGuide());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuide()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.guide, other.guide);
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
    StringBuilder sb = new StringBuilder("BroadcastMetadata(");
    boolean first = true;

    sb.append("visibility:");
    if (this.visibility == null) {
      sb.append("null");
    } else {
      sb.append(this.visibility);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("warehouseUri:");
    if (this.warehouseUri == null) {
      sb.append("null");
    } else {
      sb.append(this.warehouseUri);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("guide:");
    if (this.guide == null) {
      sb.append("null");
    } else {
      sb.append(this.guide);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (visibility != null) {
      visibility.validate();
    }
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

  private static class BroadcastMetadataStandardSchemeFactory implements SchemeFactory {
    public BroadcastMetadataStandardScheme getScheme() {
      return new BroadcastMetadataStandardScheme();
    }
  }

  private static class BroadcastMetadataStandardScheme extends StandardScheme<BroadcastMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BroadcastMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.visibility = new ezbake.base.thrift.Visibility();
              struct.visibility.read(iprot);
              struct.setVisibilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WAREHOUSE_URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.warehouseUri = iprot.readString();
              struct.setWarehouseUriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GUIDE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.guide = iprot.readString();
              struct.setGuideIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BroadcastMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.visibility != null) {
        oprot.writeFieldBegin(VISIBILITY_FIELD_DESC);
        struct.visibility.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.warehouseUri != null) {
        oprot.writeFieldBegin(WAREHOUSE_URI_FIELD_DESC);
        oprot.writeString(struct.warehouseUri);
        oprot.writeFieldEnd();
      }
      if (struct.guide != null) {
        oprot.writeFieldBegin(GUIDE_FIELD_DESC);
        oprot.writeString(struct.guide);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BroadcastMetadataTupleSchemeFactory implements SchemeFactory {
    public BroadcastMetadataTupleScheme getScheme() {
      return new BroadcastMetadataTupleScheme();
    }
  }

  private static class BroadcastMetadataTupleScheme extends TupleScheme<BroadcastMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BroadcastMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVisibility()) {
        optionals.set(0);
      }
      if (struct.isSetWarehouseUri()) {
        optionals.set(1);
      }
      if (struct.isSetGuide()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVisibility()) {
        struct.visibility.write(oprot);
      }
      if (struct.isSetWarehouseUri()) {
        oprot.writeString(struct.warehouseUri);
      }
      if (struct.isSetGuide()) {
        oprot.writeString(struct.guide);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BroadcastMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.visibility = new ezbake.base.thrift.Visibility();
        struct.visibility.read(iprot);
        struct.setVisibilityIsSet(true);
      }
      if (incoming.get(1)) {
        struct.warehouseUri = iprot.readString();
        struct.setWarehouseUriIsSet(true);
      }
      if (incoming.get(2)) {
        struct.guide = iprot.readString();
        struct.setGuideIsSet(true);
      }
    }
  }

}

