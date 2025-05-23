<!-- components/header.jsp -->
<!DOCTYPE html>
<html>
  <head>
    <title><%= request.getParameter("pageTitle") != null ? request.getParameter("pageTitle") : "Título por defecto" %></title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  </head>
    <body class="bg-gray-100 text-gray-900">
        <header>
            <!-- Barra redes -->
            <div class="bg-blue-900 text-gray-300 flex justify-center">
               <div class="flex justify-between max-w-[1100px] p-1 w-full items-center">
                   <div>
                       <i class="fa-solid fa-phone-volume"></i> (01) 511-5110
                   </div>
                   <div class="flex">
                       <div class="m-1 rounded-lg border border-gray-300 p-1">
                           <i class="fa-brands fa-facebook-f"></i>
                       </div>
                       <div class="m-1 rounded-lg border border-gray-300 p-1">
                           <i class="fa-brands fa-instagram"></i>
                       </div>
                       <div class="m-1 rounded-lg border border-gray-300 p-1">
                           <i class="fa-brands fa-linkedin-in"></i>
                       </div>
                       <div class="m-1 rounded-lg border border-gray-300 p-1">
                           <i class="fa-brands fa-twitter"></i>
                       </div>
                       <div class="m-1 rounded-lg border border-gray-300 p-1">
                           <i class="fa-brands fa-youtube"></i>
                       </div>
                       <div class="m-1 rounded-lg border border-gray-300 p-1">
                           <i class="fa-brands fa-tiktok"></i>
                       </div>                       
                   </div>
               </div>
            </div>
            <!-- Menu -->
            <div class="flex justify-center bg-white">
                <div class="flex justify-between max-w-[1100px] p-[10px] w-full">
                    <img src="images/logo_Serpost.svg" alt="Logo" class="h-[80px]">
                </div>
                <div>
                    
                </div>
            </div>
            <!-- NAV -->
            <div class="flex justify-center">
                <div class="flex justify-between max-w-[1100px] w-full">
                    <div class="flex m-2">
                      <div class="p-2">
                        Inicio  
                      </div>
                      <div class="p-2">
                        <i class="fa-solid fa-angle-right"></i> 
                      </div>
                      <div class="p-2 text-blue-500">
                        Cuentas
                      </div>  
                    </div>
                </div>
            </div>
        </header>
