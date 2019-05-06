import { OrdersComponent } from './component/orders/orders.component';
import { EmployeesComponent } from './employees/employees.component';
import { AddStoreComponent } from './component/add-store/add-store.component';
import { ErrorComponent } from './error/error.component';

import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { PmComponent } from './pm/pm.component';
import { AdminComponent } from './admin/admin.component';
import { StoreComponent } from './store/store.component';
import { StoreItemComponent } from './component/store-item/store-item.component';
import { store } from '@angular/core/src/render3';
import { RecipComponent } from './component/recip/recip.component';


const routes: Routes = [
    {
        path: 'home',
        component: HomeComponent
    },
    {
        path: 'user',
        component: UserComponent
    },
    {
        path: 'pm',
        component: PmComponent
    },
    {
        path: 'admin',
        component: AdminComponent
    },
    {
        path: 'auth/login',
        component: LoginComponent
    },
    {
        path: 'signup',
        component: RegisterComponent
    },

    {
        path: 'store',
        component: StoreItemComponent
    },


    {
        path: 'storeRoot',
        component: StoreComponent
    },

    {
        path: 'store/:store_id',
        component: StoreComponent
    },

    {
        path: '',
        redirectTo: 'home',
        pathMatch: 'full'
    },

    {
        path: 'add-store',
        component: AddStoreComponent
    },

    {
        path: 'employees',
        component: EmployeesComponent
    },
    {
        path: 'recip',
        component: RecipComponent
    },


    {
        path: 'orders',
        component: OrdersComponent
    },

    {
        path: '**',
        component: ErrorComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
