public class PaintJob {
   public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
	        int bucketsNeeded = 0;
		  if (width < 0 || height < 0 || extraBuckets < 0){ 
	            return -1;
	    } else { 
	        double area = height * width;
	        double bucketArea = (bucketsNeeded + extraBuckets) * areaPerBucket;
	        while (bucketArea < area) {
	           bucketsNeeded++;
	           bucketArea = (bucketsNeeded + extraBuckets) * areaPerBucket; 
	        } 
	    }
          return bucketsNeeded;

	  } 
	  
	  public static int getBucketCount (double width, double height, double areaPerBucket){ 
	        if (width <= 0 || height <= 0 || areaPerBucket <= 0){ 
	        return -1;
	           } else {
	               double area = width * height; 
	               int noBuckets = 0;
	               double bucketAreaCovers = areaPerBucket * noBuckets;  
	               while (bucketAreaCovers < area){
	                   noBuckets++; 
	                   bucketAreaCovers = areaPerBucket * noBuckets;
	               }
	               return noBuckets;
	           }
	      } 
	      
	      public static int getBucketCount (double area, double areaPerBucket){
	          if (area <= 0 || areaPerBucket <= 0) {
	              return -1;
	          } else {
	              int buckets = 0; 
	              double bucketArea = buckets * areaPerBucket; 
	              while (bucketArea < area){ 
	                  buckets++;  
	                  bucketArea = buckets * areaPerBucket;
	          }
	          return buckets;
	      } 
	      }
}
