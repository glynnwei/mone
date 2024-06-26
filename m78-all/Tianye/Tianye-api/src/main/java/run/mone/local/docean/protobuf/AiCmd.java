// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bo.proto

package run.mone.local.docean.protobuf;

/**
 * Protobuf type {@code run.mone.local.docean.protobuf.AiCmd}
 */
public final class AiCmd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:run.mone.local.docean.protobuf.AiCmd)
    AiCmdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AiCmd.newBuilder() to construct.
  private AiCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AiCmd() {
    cmd_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AiCmd();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AiCmd(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            cmd_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cmdMeta_ = com.google.protobuf.MapField.newMapField(
                  CmdMetaDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            cmdMeta__ = input.readMessage(
                CmdMetaDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            cmdMeta_.getMutableMap().put(
                cmdMeta__.getKey(), cmdMeta__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return run.mone.local.docean.protobuf.Bo.internal_static_run_mone_local_docean_protobuf_AiCmd_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetCmdMeta();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return run.mone.local.docean.protobuf.Bo.internal_static_run_mone_local_docean_protobuf_AiCmd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            run.mone.local.docean.protobuf.AiCmd.class, run.mone.local.docean.protobuf.AiCmd.Builder.class);
  }

  public static final int CMD_FIELD_NUMBER = 1;
  private volatile java.lang.Object cmd_;
  /**
   * <code>string cmd = 1;</code>
   * @return The cmd.
   */
  @java.lang.Override
  public java.lang.String getCmd() {
    java.lang.Object ref = cmd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cmd_ = s;
      return s;
    }
  }
  /**
   * <code>string cmd = 1;</code>
   * @return The bytes for cmd.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCmdBytes() {
    java.lang.Object ref = cmd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cmd_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CMDMETA_FIELD_NUMBER = 2;
  private static final class CmdMetaDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                run.mone.local.docean.protobuf.Bo.internal_static_run_mone_local_docean_protobuf_AiCmd_CmdMetaEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> cmdMeta_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetCmdMeta() {
    if (cmdMeta_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CmdMetaDefaultEntryHolder.defaultEntry);
    }
    return cmdMeta_;
  }

  public int getCmdMetaCount() {
    return internalGetCmdMeta().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
   */

  @java.lang.Override
  public boolean containsCmdMeta(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCmdMeta().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCmdMetaMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getCmdMeta() {
    return getCmdMetaMap();
  }
  /**
   * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getCmdMetaMap() {
    return internalGetCmdMeta().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getCmdMetaOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCmdMeta().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getCmdMetaOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCmdMeta().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cmd_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cmd_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCmdMeta(),
        CmdMetaDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cmd_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cmd_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetCmdMeta().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      cmdMeta__ = CmdMetaDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, cmdMeta__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof run.mone.local.docean.protobuf.AiCmd)) {
      return super.equals(obj);
    }
    run.mone.local.docean.protobuf.AiCmd other = (run.mone.local.docean.protobuf.AiCmd) obj;

    if (!getCmd()
        .equals(other.getCmd())) return false;
    if (!internalGetCmdMeta().equals(
        other.internalGetCmdMeta())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CMD_FIELD_NUMBER;
    hash = (53 * hash) + getCmd().hashCode();
    if (!internalGetCmdMeta().getMap().isEmpty()) {
      hash = (37 * hash) + CMDMETA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCmdMeta().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static run.mone.local.docean.protobuf.AiCmd parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(run.mone.local.docean.protobuf.AiCmd prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code run.mone.local.docean.protobuf.AiCmd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:run.mone.local.docean.protobuf.AiCmd)
      run.mone.local.docean.protobuf.AiCmdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return run.mone.local.docean.protobuf.Bo.internal_static_run_mone_local_docean_protobuf_AiCmd_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetCmdMeta();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableCmdMeta();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return run.mone.local.docean.protobuf.Bo.internal_static_run_mone_local_docean_protobuf_AiCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              run.mone.local.docean.protobuf.AiCmd.class, run.mone.local.docean.protobuf.AiCmd.Builder.class);
    }

    // Construct using run.mone.local.docean.protobuf.AiCmd.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cmd_ = "";

      internalGetMutableCmdMeta().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return run.mone.local.docean.protobuf.Bo.internal_static_run_mone_local_docean_protobuf_AiCmd_descriptor;
    }

    @java.lang.Override
    public run.mone.local.docean.protobuf.AiCmd getDefaultInstanceForType() {
      return run.mone.local.docean.protobuf.AiCmd.getDefaultInstance();
    }

    @java.lang.Override
    public run.mone.local.docean.protobuf.AiCmd build() {
      run.mone.local.docean.protobuf.AiCmd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public run.mone.local.docean.protobuf.AiCmd buildPartial() {
      run.mone.local.docean.protobuf.AiCmd result = new run.mone.local.docean.protobuf.AiCmd(this);
      int from_bitField0_ = bitField0_;
      result.cmd_ = cmd_;
      result.cmdMeta_ = internalGetCmdMeta();
      result.cmdMeta_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof run.mone.local.docean.protobuf.AiCmd) {
        return mergeFrom((run.mone.local.docean.protobuf.AiCmd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(run.mone.local.docean.protobuf.AiCmd other) {
      if (other == run.mone.local.docean.protobuf.AiCmd.getDefaultInstance()) return this;
      if (!other.getCmd().isEmpty()) {
        cmd_ = other.cmd_;
        onChanged();
      }
      internalGetMutableCmdMeta().mergeFrom(
          other.internalGetCmdMeta());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      run.mone.local.docean.protobuf.AiCmd parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (run.mone.local.docean.protobuf.AiCmd) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object cmd_ = "";
    /**
     * <code>string cmd = 1;</code>
     * @return The cmd.
     */
    public java.lang.String getCmd() {
      java.lang.Object ref = cmd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cmd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cmd = 1;</code>
     * @return The bytes for cmd.
     */
    public com.google.protobuf.ByteString
        getCmdBytes() {
      java.lang.Object ref = cmd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cmd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cmd = 1;</code>
     * @param value The cmd to set.
     * @return This builder for chaining.
     */
    public Builder setCmd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cmd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cmd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCmd() {
      
      cmd_ = getDefaultInstance().getCmd();
      onChanged();
      return this;
    }
    /**
     * <code>string cmd = 1;</code>
     * @param value The bytes for cmd to set.
     * @return This builder for chaining.
     */
    public Builder setCmdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cmd_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> cmdMeta_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetCmdMeta() {
      if (cmdMeta_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CmdMetaDefaultEntryHolder.defaultEntry);
      }
      return cmdMeta_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableCmdMeta() {
      onChanged();;
      if (cmdMeta_ == null) {
        cmdMeta_ = com.google.protobuf.MapField.newMapField(
            CmdMetaDefaultEntryHolder.defaultEntry);
      }
      if (!cmdMeta_.isMutable()) {
        cmdMeta_ = cmdMeta_.copy();
      }
      return cmdMeta_;
    }

    public int getCmdMetaCount() {
      return internalGetCmdMeta().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */

    @java.lang.Override
    public boolean containsCmdMeta(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCmdMeta().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCmdMetaMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getCmdMeta() {
      return getCmdMetaMap();
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getCmdMetaMap() {
      return internalGetCmdMeta().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getCmdMetaOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCmdMeta().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getCmdMetaOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCmdMeta().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCmdMeta() {
      internalGetMutableCmdMeta().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */

    public Builder removeCmdMeta(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCmdMeta().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableCmdMeta() {
      return internalGetMutableCmdMeta().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */
    public Builder putCmdMeta(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableCmdMeta().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; cmdMeta = 2;</code>
     */

    public Builder putAllCmdMeta(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableCmdMeta().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:run.mone.local.docean.protobuf.AiCmd)
  }

  // @@protoc_insertion_point(class_scope:run.mone.local.docean.protobuf.AiCmd)
  private static final run.mone.local.docean.protobuf.AiCmd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new run.mone.local.docean.protobuf.AiCmd();
  }

  public static run.mone.local.docean.protobuf.AiCmd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AiCmd>
      PARSER = new com.google.protobuf.AbstractParser<AiCmd>() {
    @java.lang.Override
    public AiCmd parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AiCmd(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AiCmd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AiCmd> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public run.mone.local.docean.protobuf.AiCmd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

