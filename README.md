# Swipe Assign App
In this app selected user can send random product in this app and thy also see their product.

## Tech used - :
Retrofit ( Post with @querymap) RestApi Calling methods,  okhttp, Co-routines , Kotlin Flows , Convert app in Model-View-View-Model Architecture (MVVM) ,<br> navigation graph for bottom tab , JetpackCompose, not uses any xml layout only use compostable in a single screen.<br>
Added three more Interceptors.<br>
1- HttpLoggingInterceptor.<br>
2- HandlerInterceptor.<br>

## Api source -:
https://app.getswipe.in/api/public/get  <br>
https://app.getswipe.in/api/public/add

### Response body for get method-:


[

    {
        "image": "",
        "price": 45.00000000,
        "product_name": "gam",
        "product_type": "ggh",
        "tax": 45.0
    },
    
    {
        "image": "",
        "price": 10.20000000,
        "product_name": "final",
        "product_type": "type 4",
        "tax": 10.29
    },
    
    {
        "image": "",
        "price": 69.30000000,
        "product_name": "John kim",
        "product_type": "type 2",
        "tax": 98.5
    },
    
    {
        "image": "",
        "price": 87.54000000,
        "product_name": "ctt",
        "product_type": "type 1",
        "tax": 88.55
    },
    
    {
        "image": "",
        "price": 55.80000000,
        "product_name": " drvtb",
        "product_type": "type 1",
        "tax": 55.2
    },
    
    {
        "image": "",
        "price": 4549.40000000,
        "product_name": "sys",
        "product_type": "type 1",
        "tax": 84.46
    },
    
    {
        "image": "",
        "price": 450.00000000,
        "product_name": "Pedegree",
        "product_type": "Product",
        "tax": 18.0
    },
    
    {
        "image": "",
        "price": 755.00000000,
        "product_name": "abc",
        "product_type": "Others",
        "tax": 5.0
    },
    
    {
        "image": "https://vx-erp-product-images.s3.ap-south-1.amazonaws.com/9_1686302407_0_JPEG_20230609_145002_1649909643540357410.jpg",
        "price": 76.00000000,
        "product_name": "SD card",
        "product_type": "Electronics",
        "tax": 54.0
    },
    
    {
        "image": "https://vx-erp-product-images.s3.ap-south-1.amazonaws.com/9_1686297122_0_JPEG_20230609_132200_1561117286688530362.jpg",
        "price": 150.00000000,
        "product_name": "oreo",
        "product_type": "dog",
        "tax": 8.0
    },
    
    {
        "image": "https://vx-erp-product-images.s3.ap-south-1.amazonaws.com/9_1686296470_0_JPEG_20230609_131105_7649528549177226870.jpg",
        "price": 5990.00000000,
        "product_name": "SD card",
        "product_type": "electronics",
        "tax": 32.0
    },
    
    {
        "image": "",
        "price": 5655.55000000,
        "product_name": "cfinal",
        "product_type": "type",
        "tax": 558.8
    },
    
    {
        "image": "",
        "price": 885.00000000,
        "product_name": "gggg",
        "product_type": "fcvv",
        "tax": 9.9
    },
    
    {
        "image": "",
        "price": 64.40000000,
        "product_name": "ndjs",
        "product_type": "Grocery",
        "tax": 26.0
    },
    
    {
        "image": "",
        "price": 6868.53568800,
        "product_name": "kim",
        "product_type": "tdydh",
        "tax": 57.55
    },
    
    {
        "image": "",
        "price": 797.00000000,
        "product_name": "moas",
        "product_type": "Oil",
        "tax": 4.4
    },
    
    {
        "image": "https://vx-erp-product-images.s3.ap-south-1.amazonaws.com/9_1686293684_0_IMG_20230609_122422913.jpg",
        "price": 1280.58000000,
        "product_name": "DI",
        "product_type": "General",
        "tax": 1.5
    },
    
    {
        "image": "",
        "price": 7979.00000000,
        "product_name": "sbsh",
        "product_type": "Grocery",
        "tax": 49.0
    },
    
    {
        "image": "",
        "price": 955.00000000,
        "product_name": "tttg",
        "product_type": "Perfume",
        "tax": 85.0
    },
    
    {
        "image": "",
        "price": 94.00000000,
        "product_name": "bshsh",
        "product_type": "Grocery",
        "tax": 94.0
    }
]

### Response body for add, post method -:


`
   {
   
    "message": "Product added Successfully!",
    "product_details":
    
    {
        "image": "",
        "price": 122.00000000,
        "product_name": "vhhbhbhbh",
        "product_type": "ghghh",
        "tax": 45.0
    },
    
    "product_id": 10874,
    "success": true
    
   }

`

## Screens and ViewModel-:
1- All Screen (In that file I used all the composable screen in it ).<br>
2- Navigation Graph.<br>
3- Sealed class for navigation menu.<br>
4- Data classes<br>
5- AllViewModel  (Here I write all logic for my suspend retrofit post, get request method in the viewmodelscop.lanch and add the response in mutablelistflowstate )
## Download Apk here -:
Download Apk -https://github.com/Prashant830/SwipeAssign/blob/main/app/release/app-release.apk


## App Demo Video here -:
https://drive.google.com/file/d/11wy1Q4mS7PGR8oCG-6rYZIJ-rtKJvu2l/view?usp=drivesdk
