import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { PmComponent } from './pm/pm.component';

import { httpInterceptorProviders } from './auth/auth-interceptor';
import { StoreComponent } from './store/store.component';
import { ErrorComponent } from './error/error.component';
import { StoreItemComponent } from './component/store-item/store-item.component';
import { AddStoreComponent } from './component/add-store/add-store.component';
import { EmployeesComponent } from './employees/employees.component';
import { OrdersComponent } from './component/orders/orders.component';
import { AddOrderComponent } from './component/add-order/add-order.component';
import { RecipComponent } from './component/recip/recip.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserComponent,
    RegisterComponent,
    HomeComponent,
    AdminComponent,
    PmComponent,
    StoreComponent,
    ErrorComponent,
    RecipComponent,
    StoreItemComponent,
    AddStoreComponent,

    EmployeesComponent,
    OrdersComponent,
    AddOrderComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [httpInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
