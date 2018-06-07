iiiiiiii:x

package io.bittiger.adindex;

/**
 * Protobuf type {@code adindex.Ad}
 */
public  final class Ad extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adindex.Ad)
    AdOrBuilder {
  // Use Ad.newBuilder() to construct.
  private Ad(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Ad() {
    adId_ = 0L;
    campaignId_ = 0L;
    keyWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    relevanceScore_ = 0D;
    pClick_ = 0D;
    bidPrice_ = 0D;
    rankScore_ = 0D;
    qualityScore_ = 0D;
    costPerClick_ = 0D;
    position_ = 0;
    title_ = "";
    price_ = 0D;
    thumbnail_ = "";
    description_ = "";
    brand_ = "";
    detailUrl_ = "";
    query_ = "";
    category_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Ad(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            adId_ = input.readInt64();
            break;
          }
          case 16: {

            campaignId_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              keyWords_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            keyWords_.add(s);
            break;
          }
          case 33: {

            relevanceScore_ = input.readDouble();
            break;
          }
          case 41: {

            pClick_ = input.readDouble();
            break;
          }
          case 49: {

            bidPrice_ = input.readDouble();
            break;
          }
          case 57: {

            rankScore_ = input.readDouble();
            break;
          }
          case 65: {

            qualityScore_ = input.readDouble();
            break;
          }
          case 73: {

            costPerClick_ = input.readDouble();
            break;
          }
          case 80: {

            position_ = input.readInt32();
            break;
          }
          case 90: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 97: {

            price_ = input.readDouble();
            break;
          }
          case 106: {
            java.lang.String s = input.readStringRequireUtf8();

            thumbnail_ = s;
            break;
          }
          case 114: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 122: {
            java.lang.String s = input.readStringRequireUtf8();

            brand_ = s;
            break;
          }
          case 130: {
            java.lang.String s = input.readStringRequireUtf8();

            detailUrl_ = s;
            break;
          }
          case 138: {
            java.lang.String s = input.readStringRequireUtf8();

            query_ = s;
            break;
          }
          case 146: {
            java.lang.String s = input.readStringRequireUtf8();

            category_ = s;
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        keyWords_ = keyWords_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bittiger.adindex.SearchAds.internal_static_adindex_Ad_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bittiger.adindex.SearchAds.internal_static_adindex_Ad_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bittiger.adindex.Ad.class, io.bittiger.adindex.Ad.Builder.class);
  }

  private int bitField0_;
  public static final int ADID_FIELD_NUMBER = 1;
  private long adId_;
  /**
   * <code>int64 adId = 1;</code>
   */
  public long getAdId() {
    return adId_;
  }

  public static final int CAMPAIGNID_FIELD_NUMBER = 2;
  private long campaignId_;
  /**
   * <code>int64 campaignId = 2;</code>
   */
  public long getCampaignId() {
    return campaignId_;
  }

  public static final int KEYWORDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList keyWords_;
  /**
   * <code>repeated string keyWords = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getKeyWordsList() {
    return keyWords_;
  }
  /**
   * <code>repeated string keyWords = 3;</code>
   */
  public int getKeyWordsCount() {
    return keyWords_.size();
  }
  /**
   * <code>repeated string keyWords = 3;</code>
   */
  public java.lang.String getKeyWords(int index) {
    return keyWords_.get(index);
  }
  /**
   * <code>repeated string keyWords = 3;</code>
   */
  public com.google.protobuf.ByteString
      getKeyWordsBytes(int index) {
    return keyWords_.getByteString(index);
  }

  public static final int RELEVANCESCORE_FIELD_NUMBER = 4;
  private double relevanceScore_;
  /**
   * <code>double relevanceScore = 4;</code>
   */
  public double getRelevanceScore() {
    return relevanceScore_;
  }

  public static final int PCLICK_FIELD_NUMBER = 5;
  private double pClick_;
  /**
   * <code>double pClick = 5;</code>
   */
  public double getPClick() {
    return pClick_;
  }

  public static final int BIDPRICE_FIELD_NUMBER = 6;
  private double bidPrice_;
  /**
   * <code>double bidPrice = 6;</code>
   */
  public double getBidPrice() {
    return bidPrice_;
  }

  public static final int RANKSCORE_FIELD_NUMBER = 7;
  private double rankScore_;
  /**
   * <code>double rankScore = 7;</code>
   */
  public double getRankScore() {
    return rankScore_;
  }

  public static final int QUALITYSCORE_FIELD_NUMBER = 8;
  private double qualityScore_;
  /**
   * <code>double qualityScore = 8;</code>
   */
  public double getQualityScore() {
    return qualityScore_;
  }

  public static final int COSTPERCLICK_FIELD_NUMBER = 9;
  private double costPerClick_;
  /**
   * <code>double costPerClick = 9;</code>
   */
  public double getCostPerClick() {
    return costPerClick_;
  }

  public static final int POSITION_FIELD_NUMBER = 10;
  private int position_;
  /**
   * <pre>
   *1: top , 2: bottom
   * </pre>
   *
   * <code>int32 position = 10;</code>
   */
  public int getPosition() {
    return position_;
  }

  public static final int TITLE_FIELD_NUMBER = 11;
  private volatile java.lang.Object title_;
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string title = 11;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string title = 11;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 12;
  private double price_;
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>double price = 12;</code>
   */
  public double getPrice() {
    return price_;
  }

  public static final int THUMBNAIL_FIELD_NUMBER = 13;
  private volatile java.lang.Object thumbnail_;
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string thumbnail = 13;</code>
   */
  public java.lang.String getThumbnail() {
    java.lang.Object ref = thumbnail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thumbnail_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string thumbnail = 13;</code>
   */
  public com.google.protobuf.ByteString
      getThumbnailBytes() {
    java.lang.Object ref = thumbnail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      thumbnail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 14;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string description = 14;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string description = 14;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BRAND_FIELD_NUMBER = 15;
  private volatile java.lang.Object brand_;
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string brand = 15;</code>
   */
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string brand = 15;</code>
   */
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETAIL_URL_FIELD_NUMBER = 16;
  private volatile java.lang.Object detailUrl_;
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string detail_url = 16;</code>
   */
  public java.lang.String getDetailUrl() {
    java.lang.Object ref = detailUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detailUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string detail_url = 16;</code>
   */
  public com.google.protobuf.ByteString
      getDetailUrlBytes() {
    java.lang.Object ref = detailUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detailUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERY_FIELD_NUMBER = 17;
  private volatile java.lang.Object query_;
  /**
   * <pre>
   *required
   * </pre>
   *
   * <code>string query = 17;</code>
   */
  public java.lang.String getQuery() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      query_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *required
   * </pre>
   *
   * <code>string query = 17;</code>
   */
  public com.google.protobuf.ByteString
      getQueryBytes() {
    java.lang.Object ref = query_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      query_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORY_FIELD_NUMBER = 18;
  private volatile java.lang.Object category_;
  /**
   * <code>string category = 18;</code>
   */
  public java.lang.String getCategory() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      category_ = s;
      return s;
    }
  }
  /**
   * <code>string category = 18;</code>
   */
  public com.google.protobuf.ByteString
      getCategoryBytes() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      category_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (adId_ != 0L) {
      output.writeInt64(1, adId_);
    }
    if (campaignId_ != 0L) {
      output.writeInt64(2, campaignId_);
    }
    for (int i = 0; i < keyWords_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keyWords_.getRaw(i));
    }
    if (relevanceScore_ != 0D) {
      output.writeDouble(4, relevanceScore_);
    }
    if (pClick_ != 0D) {
      output.writeDouble(5, pClick_);
    }
    if (bidPrice_ != 0D) {
      output.writeDouble(6, bidPrice_);
    }
    if (rankScore_ != 0D) {
      output.writeDouble(7, rankScore_);
    }
    if (qualityScore_ != 0D) {
      output.writeDouble(8, qualityScore_);
    }
    if (costPerClick_ != 0D) {
      output.writeDouble(9, costPerClick_);
    }
    if (position_ != 0) {
      output.writeInt32(10, position_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, title_);
    }
    if (price_ != 0D) {
      output.writeDouble(12, price_);
    }
    if (!getThumbnailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 13, thumbnail_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 14, description_);
    }
    if (!getBrandBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 15, brand_);
    }
    if (!getDetailUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 16, detailUrl_);
    }
    if (!getQueryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 17, query_);
    }
    if (!getCategoryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 18, category_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, adId_);
    }
    if (campaignId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, campaignId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keyWords_.size(); i++) {
        dataSize += computeStringSizeNoTag(keyWords_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeyWordsList().size();
    }
    if (relevanceScore_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, relevanceScore_);
    }
    if (pClick_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, pClick_);
    }
    if (bidPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, bidPrice_);
    }
    if (rankScore_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, rankScore_);
    }
    if (qualityScore_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(8, qualityScore_);
    }
    if (costPerClick_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(9, costPerClick_);
    }
    if (position_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, position_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, title_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(12, price_);
    }
    if (!getThumbnailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, thumbnail_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, description_);
    }
    if (!getBrandBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, brand_);
    }
    if (!getDetailUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(16, detailUrl_);
    }
    if (!getQueryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(17, query_);
    }
    if (!getCategoryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(18, category_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.bittiger.adindex.Ad)) {
      return super.equals(obj);
    }
    io.bittiger.adindex.Ad other = (io.bittiger.adindex.Ad) obj;

    boolean result = true;
    result = result && (getAdId()
        == other.getAdId());
    result = result && (getCampaignId()
        == other.getCampaignId());
    result = result && getKeyWordsList()
        .equals(other.getKeyWordsList());
    result = result && (
        java.lang.Double.doubleToLongBits(getRelevanceScore())
        == java.lang.Double.doubleToLongBits(
            other.getRelevanceScore()));
    result = result && (
        java.lang.Double.doubleToLongBits(getPClick())
        == java.lang.Double.doubleToLongBits(
            other.getPClick()));
    result = result && (
        java.lang.Double.doubleToLongBits(getBidPrice())
        == java.lang.Double.doubleToLongBits(
            other.getBidPrice()));
    result = result && (
        java.lang.Double.doubleToLongBits(getRankScore())
        == java.lang.Double.doubleToLongBits(
            other.getRankScore()));
    result = result && (
        java.lang.Double.doubleToLongBits(getQualityScore())
        == java.lang.Double.doubleToLongBits(
            other.getQualityScore()));
    result = result && (
        java.lang.Double.doubleToLongBits(getCostPerClick())
        == java.lang.Double.doubleToLongBits(
            other.getCostPerClick()));
    result = result && (getPosition()
        == other.getPosition());
    result = result && getTitle()
        .equals(other.getTitle());
    result = result && (
        java.lang.Double.doubleToLongBits(getPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPrice()));
    result = result && getThumbnail()
        .equals(other.getThumbnail());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && getBrand()
        .equals(other.getBrand());
    result = result && getDetailUrl()
        .equals(other.getDetailUrl());
    result = result && getQuery()
        .equals(other.getQuery());
    result = result && getCategory()
        .equals(other.getCategory());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAdId());
    hash = (37 * hash) + CAMPAIGNID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignId());
    if (getKeyWordsCount() > 0) {
      hash = (37 * hash) + KEYWORDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeyWordsList().hashCode();
    }
    hash = (37 * hash) + RELEVANCESCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getRelevanceScore()));
    hash = (37 * hash) + PCLICK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPClick()));
    hash = (37 * hash) + BIDPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBidPrice()));
    hash = (37 * hash) + RANKSCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getRankScore()));
    hash = (37 * hash) + QUALITYSCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getQualityScore()));
    hash = (37 * hash) + COSTPERCLICK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCostPerClick()));
    hash = (37 * hash) + POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getPosition();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + THUMBNAIL_FIELD_NUMBER;
    hash = (53 * hash) + getThumbnail().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + DETAIL_URL_FIELD_NUMBER;
    hash = (53 * hash) + getDetailUrl().hashCode();
    hash = (37 * hash) + QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getQuery().hashCode();
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + getCategory().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bittiger.adindex.Ad parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bittiger.adindex.Ad parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bittiger.adindex.Ad parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bittiger.adindex.Ad parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bittiger.adindex.Ad parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bittiger.adindex.Ad parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.bittiger.adindex.Ad prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code adindex.Ad}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adindex.Ad)
      io.bittiger.adindex.AdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bittiger.adindex.SearchAds.internal_static_adindex_Ad_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bittiger.adindex.SearchAds.internal_static_adindex_Ad_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bittiger.adindex.Ad.class, io.bittiger.adindex.Ad.Builder.class);
    }

    // Construct using io.bittiger.adindex.Ad.newBuilder()
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
    public Builder clear() {
      super.clear();
      adId_ = 0L;

      campaignId_ = 0L;

      keyWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      relevanceScore_ = 0D;

      pClick_ = 0D;

      bidPrice_ = 0D;

      rankScore_ = 0D;

      qualityScore_ = 0D;

      costPerClick_ = 0D;

      position_ = 0;

      title_ = "";

      price_ = 0D;

      thumbnail_ = "";

      description_ = "";

      brand_ = "";

      detailUrl_ = "";

      query_ = "";

      category_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bittiger.adindex.SearchAds.internal_static_adindex_Ad_descriptor;
    }

    public io.bittiger.adindex.Ad getDefaultInstanceForType() {
      return io.bittiger.adindex.Ad.getDefaultInstance();
    }

    public io.bittiger.adindex.Ad build() {
      io.bittiger.adindex.Ad result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bittiger.adindex.Ad buildPartial() {
      io.bittiger.adindex.Ad result = new io.bittiger.adindex.Ad(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.adId_ = adId_;
      result.campaignId_ = campaignId_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        keyWords_ = keyWords_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.keyWords_ = keyWords_;
      result.relevanceScore_ = relevanceScore_;
      result.pClick_ = pClick_;
      result.bidPrice_ = bidPrice_;
      result.rankScore_ = rankScore_;
      result.qualityScore_ = qualityScore_;
      result.costPerClick_ = costPerClick_;
      result.position_ = position_;
      result.title_ = title_;
      result.price_ = price_;
      result.thumbnail_ = thumbnail_;
      result.description_ = description_;
      result.brand_ = brand_;
      result.detailUrl_ = detailUrl_;
      result.query_ = query_;
      result.category_ = category_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bittiger.adindex.Ad) {
        return mergeFrom((io.bittiger.adindex.Ad)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bittiger.adindex.Ad other) {
      if (other == io.bittiger.adindex.Ad.getDefaultInstance()) return this;
      if (other.getAdId() != 0L) {
        setAdId(other.getAdId());
      }
      if (other.getCampaignId() != 0L) {
        setCampaignId(other.getCampaignId());
      }
      if (!other.keyWords_.isEmpty()) {
        if (keyWords_.isEmpty()) {
          keyWords_ = other.keyWords_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureKeyWordsIsMutable();
          keyWords_.addAll(other.keyWords_);
        }
        onChanged();
      }
      if (other.getRelevanceScore() != 0D) {
        setRelevanceScore(other.getRelevanceScore());
      }
      if (other.getPClick() != 0D) {
        setPClick(other.getPClick());
      }
      if (other.getBidPrice() != 0D) {
        setBidPrice(other.getBidPrice());
      }
      if (other.getRankScore() != 0D) {
        setRankScore(other.getRankScore());
      }
      if (other.getQualityScore() != 0D) {
        setQualityScore(other.getQualityScore());
      }
      if (other.getCostPerClick() != 0D) {
        setCostPerClick(other.getCostPerClick());
      }
      if (other.getPosition() != 0) {
        setPosition(other.getPosition());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (!other.getThumbnail().isEmpty()) {
        thumbnail_ = other.thumbnail_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (!other.getDetailUrl().isEmpty()) {
        detailUrl_ = other.detailUrl_;
        onChanged();
      }
      if (!other.getQuery().isEmpty()) {
        query_ = other.query_;
        onChanged();
      }
      if (!other.getCategory().isEmpty()) {
        category_ = other.category_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.bittiger.adindex.Ad parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bittiger.adindex.Ad) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long adId_ ;
    /**
     * <code>int64 adId = 1;</code>
     */
    public long getAdId() {
      return adId_;
    }
    /**
     * <code>int64 adId = 1;</code>
     */
    public Builder setAdId(long value) {
      
      adId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 adId = 1;</code>
     */
    public Builder clearAdId() {
      
      adId_ = 0L;
      onChanged();
      return this;
    }

    private long campaignId_ ;
    /**
     * <code>int64 campaignId = 2;</code>
     */
    public long getCampaignId() {
      return campaignId_;
    }
    /**
     * <code>int64 campaignId = 2;</code>
     */
    public Builder setCampaignId(long value) {
      
      campaignId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 campaignId = 2;</code>
     */
    public Builder clearCampaignId() {
      
      campaignId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList keyWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureKeyWordsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        keyWords_ = new com.google.protobuf.LazyStringArrayList(keyWords_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getKeyWordsList() {
      return keyWords_.getUnmodifiableView();
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public int getKeyWordsCount() {
      return keyWords_.size();
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public java.lang.String getKeyWords(int index) {
      return keyWords_.get(index);
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public com.google.protobuf.ByteString
        getKeyWordsBytes(int index) {
      return keyWords_.getByteString(index);
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public Builder setKeyWords(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeyWordsIsMutable();
      keyWords_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public Builder addKeyWords(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeyWordsIsMutable();
      keyWords_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public Builder addAllKeyWords(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeyWordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keyWords_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public Builder clearKeyWords() {
      keyWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string keyWords = 3;</code>
     */
    public Builder addKeyWordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureKeyWordsIsMutable();
      keyWords_.add(value);
      onChanged();
      return this;
    }

    private double relevanceScore_ ;
    /**
     * <code>double relevanceScore = 4;</code>
     */
    public double getRelevanceScore() {
      return relevanceScore_;
    }
    /**
     * <code>double relevanceScore = 4;</code>
     */
    public Builder setRelevanceScore(double value) {
      
      relevanceScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double relevanceScore = 4;</code>
     */
    public Builder clearRelevanceScore() {
      
      relevanceScore_ = 0D;
      onChanged();
      return this;
    }

    private double pClick_ ;
    /**
     * <code>double pClick = 5;</code>
     */
    public double getPClick() {
      return pClick_;
    }
    /**
     * <code>double pClick = 5;</code>
     */
    public Builder setPClick(double value) {
      
      pClick_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double pClick = 5;</code>
     */
    public Builder clearPClick() {
      
      pClick_ = 0D;
      onChanged();
      return this;
    }

    private double bidPrice_ ;
    /**
     * <code>double bidPrice = 6;</code>
     */
    public double getBidPrice() {
      return bidPrice_;
    }
    /**
     * <code>double bidPrice = 6;</code>
     */
    public Builder setBidPrice(double value) {
      
      bidPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bidPrice = 6;</code>
     */
    public Builder clearBidPrice() {
      
      bidPrice_ = 0D;
      onChanged();
      return this;
    }

    private double rankScore_ ;
    /**
     * <code>double rankScore = 7;</code>
     */
    public double getRankScore() {
      return rankScore_;
    }
    /**
     * <code>double rankScore = 7;</code>
     */
    public Builder setRankScore(double value) {
      
      rankScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double rankScore = 7;</code>
     */
    public Builder clearRankScore() {
      
      rankScore_ = 0D;
      onChanged();
      return this;
    }

    private double qualityScore_ ;
    /**
     * <code>double qualityScore = 8;</code>
     */
    public double getQualityScore() {
      return qualityScore_;
    }
    /**
     * <code>double qualityScore = 8;</code>
     */
    public Builder setQualityScore(double value) {
      
      qualityScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double qualityScore = 8;</code>
     */
    public Builder clearQualityScore() {
      
      qualityScore_ = 0D;
      onChanged();
      return this;
    }

    private double costPerClick_ ;
    /**
     * <code>double costPerClick = 9;</code>
     */
    public double getCostPerClick() {
      return costPerClick_;
    }
    /**
     * <code>double costPerClick = 9;</code>
     */
    public Builder setCostPerClick(double value) {
      
      costPerClick_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double costPerClick = 9;</code>
     */
    public Builder clearCostPerClick() {
      
      costPerClick_ = 0D;
      onChanged();
      return this;
    }

    private int position_ ;
    /**
     * <pre>
     *1: top , 2: bottom
     * </pre>
     *
     * <code>int32 position = 10;</code>
     */
    public int getPosition() {
      return position_;
    }
    /**
     * <pre>
     *1: top , 2: bottom
     * </pre>
     *
     * <code>int32 position = 10;</code>
     */
    public Builder setPosition(int value) {
      
      position_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *1: top , 2: bottom
     * </pre>
     *
     * <code>int32 position = 10;</code>
     */
    public Builder clearPosition() {
      
      position_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string title = 11;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string title = 11;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string title = 11;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string title = 11;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string title = 11;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>double price = 12;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>double price = 12;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>double price = 12;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object thumbnail_ = "";
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string thumbnail = 13;</code>
     */
    public java.lang.String getThumbnail() {
      java.lang.Object ref = thumbnail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thumbnail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string thumbnail = 13;</code>
     */
    public com.google.protobuf.ByteString
        getThumbnailBytes() {
      java.lang.Object ref = thumbnail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        thumbnail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string thumbnail = 13;</code>
     */
    public Builder setThumbnail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      thumbnail_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string thumbnail = 13;</code>
     */
    public Builder clearThumbnail() {
      
      thumbnail_ = getDefaultInstance().getThumbnail();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string thumbnail = 13;</code>
     */
    public Builder setThumbnailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      thumbnail_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string description = 14;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string description = 14;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string description = 14;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string description = 14;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string description = 14;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string brand = 15;</code>
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string brand = 15;</code>
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string brand = 15;</code>
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string brand = 15;</code>
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string brand = 15;</code>
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object detailUrl_ = "";
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string detail_url = 16;</code>
     */
    public java.lang.String getDetailUrl() {
      java.lang.Object ref = detailUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detailUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string detail_url = 16;</code>
     */
    public com.google.protobuf.ByteString
        getDetailUrlBytes() {
      java.lang.Object ref = detailUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detailUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string detail_url = 16;</code>
     */
    public Builder setDetailUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      detailUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string detail_url = 16;</code>
     */
    public Builder clearDetailUrl() {
      
      detailUrl_ = getDefaultInstance().getDetailUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required
     * </pre>
     *
     * <code>string detail_url = 16;</code>
     */
    public Builder setDetailUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      detailUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object query_ = "";
    /**
     * <pre>
     *required
     * </pre>
     *
     * <code>string query = 17;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *required
     * </pre>
     *
     * <code>string query = 17;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *required
     * </pre>
     *
     * <code>string query = 17;</code>
     */
    public Builder setQuery(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      query_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *required
     * </pre>
     *
     * <code>string query = 17;</code>
     */
    public Builder clearQuery() {
      
      query_ = getDefaultInstance().getQuery();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *required
     * </pre>
     *
     * <code>string query = 17;</code>
     */
    public Builder setQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      query_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object category_ = "";
    /**
     * <code>string category = 18;</code>
     */
    public java.lang.String getCategory() {
      java.lang.Object ref = category_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        category_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string category = 18;</code>
     */
    public com.google.protobuf.ByteString
        getCategoryBytes() {
      java.lang.Object ref = category_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        category_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string category = 18;</code>
     */
    public Builder setCategory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string category = 18;</code>
     */
    public Builder clearCategory() {
      
      category_ = getDefaultInstance().getCategory();
      onChanged();
      return this;
    }
    /**
     * <code>string category = 18;</code>
     */
    public Builder setCategoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      category_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:adindex.Ad)
  }

  // @@protoc_insertion_point(class_scope:adindex.Ad)
  private static final io.bittiger.adindex.Ad DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bittiger.adindex.Ad();
  }

  public static io.bittiger.adindex.Ad getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Ad>
      PARSER = new com.google.protobuf.AbstractParser<Ad>() {
    public Ad parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Ad(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Ad> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Ad> getParserForType() {
    return PARSER;
  }

  public io.bittiger.adindex.Ad getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

